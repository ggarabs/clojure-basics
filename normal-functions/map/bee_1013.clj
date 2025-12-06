(ns map.bee-1013
        (:gen-class))

(require '[clojure.string :as str])

(defn -main [& _]
        (let [values (map read-string (str/split (read-line) #"\s+"))]

                (println (format "%d eh o maior" (apply max values)))))

(-main)