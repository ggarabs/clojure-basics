(ns quot.bee-1019
        (:gen-class))

(defn -main [& _]
        (let [n (Integer/parseInt (read-line))
              seconds (mod n 60)
              minutes (quot (mod n 3600) 60)
              hours (quot n 3600) ]

              (println (format "%d:%d:%d" hours minutes seconds))))

(-main)
