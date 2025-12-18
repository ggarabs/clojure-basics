(ns bee-1168)

(def lines {\1 2
            \2 5
            \3 5
            \4 4
            \5 5
            \6 6
            \7 3
            \8 7
            \9 6
            \0 6})

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))
        values (take n (repeatedly read-line))]
    (doseq [curr values]
      (println (str (reduce + 0 (map #(lines %) (seq curr))) " leds")))))

(-main)