(ns special-forms.loop.bee-1153)

(defn fatorial [num]
  (loop [x num
         acc 1] 
    (if (pos? x) 
      (recur (dec x) (* acc x)) 
      acc)))

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))
        fat_n (fatorial n)]
    (println fat_n)))

(-main)