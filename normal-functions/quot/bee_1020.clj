(ns quot.bee-1020
  (:gen-class))

(defn -main [& _]
  (let [days (Integer/parseInt (read-line))]
    (println (format "%d ano(s)" (quot days 365)))
    (println (format "%d mes(es)" (quot (mod days 365) 30)))
    (println (format "%d dia(s)" (mod (mod days 365) 30)))))

(-main)
