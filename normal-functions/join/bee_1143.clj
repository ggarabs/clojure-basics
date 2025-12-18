(ns bee-1143 
  (:require
    [clojure.string :as str]))

(defn -main [& _]
  (let [n (read-string (read-line))
        ans (reduce 
             (fn [acc x]
               (let [curr (conj [] x (* x x) (* x x x))]
                    (conj acc curr)))
             []
             (range 1 (inc n)))]
    (doseq [line ans]
      (println (str/join " " line)))))

(-main)