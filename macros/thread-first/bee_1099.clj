(ns bee-1099 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [n (-> (read-line) Integer/parseInt)]
    (doseq [_ (range n)]
      (let [[x y] (-> (read-line) 
                      (str/split #"\s+") 
                      (->> (map #(Integer/parseInt %))))
            minv (min x y)
            maxv (max x y)
            start (if (odd? minv) (+ minv 2) (inc minv))]
        (println (apply + (range start maxv 2)))))))

(-main)
