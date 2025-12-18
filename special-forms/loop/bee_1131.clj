(ns bee-1131 
  (:require
    [clojure.string :as str]))

(def initial-state {:inter 0 
                 :gremio 0 
                 :empates 0})

(defn read-input []
  (loop [acc []]
    (let [[inter gremio] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))
          _ (println "Novo grenal (1-sim 2-nao)")
          choice (read-line)
          new-acc (conj acc [inter gremio])]
      (if (= choice "2") new-acc (recur new-acc)))))

(defn update-score [state inter gremio]
  (cond
    (= inter gremio) (update state :empates inc)
    (> inter gremio) (update state :inter inc)
    :else (update state :gremio inc)))

(defn -main [& _]
  (let [scores (read-input)
        results (reduce 
                 (fn [acc [inter gremio]] (update-score acc inter gremio))
                 initial-state
                 scores)]
    (println (format "%d grenais" (apply + (vals results))))
    (println (format "Inter:%d" (results :inter)))
    (println (format "Gremio:%d" (results :gremio)))
    (println (format "Empates:%d" (results :empates)))
    (println (cond 
               (> (results :inter) (results :gremio)) "Inter venceu mais"
               (< (results :inter) (results :gremio)) "Gremio venceu mais"
               :else "Nao houve vencedor"))))

(-main)