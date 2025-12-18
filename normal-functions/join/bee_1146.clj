(ns bee-1146 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [values (take-while #(not= % 0) (repeatedly #(Integer/parseInt (read-line))))]
    (doseq [x values]
      (println (str/join " "(range 1 (inc x)))))))

(-main)