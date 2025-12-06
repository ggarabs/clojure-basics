(ns basic-io.bee-1008
        (:gen-class))

(defn -main [& _]
        (let [collaboratorID (Integer/parseInt (read-line))
              workedTime (Integer/parseInt (read-line))
              salaryPerHour (Double/parseDouble (read-line))
              revenue (* salaryPerHour workedTime)]
              (println (format "NUMBER = %d" collaboratorID))
              (println (format "SALARY = U$ %.2f" revenue))))

(-main)