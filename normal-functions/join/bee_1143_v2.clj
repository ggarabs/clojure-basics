(ns normal-functions.join.bee-1143-v2
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [n (read-string (read-line))]
    (doseq [x (range 1 (inc n))]
      (println (str/join " " [x (* x x) (* x x x)])))))

(-main)