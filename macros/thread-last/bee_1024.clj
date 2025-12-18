(ns bee-1024)

(defn shift-char [ch n op]
  (char (op (int ch) n)))

(defn encrypt [s]
  (let [half (quot (count s) 2)]
    (->> s 
         reverse
         (map-indexed (fn [i ch]
                        (cond 
                          (Character/isLetter ch) (if 
                                                   (< i half) 
                                                    (shift-char ch 3 +) 
                                                    (shift-char ch 2 +)) 
                          :else (if 
                                 (< i half) 
                                  ch 
                                  (shift-char ch 1 -))))) 
         (apply str))))

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))]
    (doseq [_ (range n)] 
      (println (encrypt (read-line))))))

(-main)