(ns bee-1134)

(defn read-number []
  (-> (read-line) (Integer/parseInt)))

(def initial-comb {1 {:name "Alcool" :qtd 0}
           2 {:name "Gasolina" :qtd 0}
           3 {:name"Diesel" :qtd 0}})

(defn -main [& _]
  (let [seq (take-while (fn [x] (not= x 4)) (repeatedly read-number))
        filtered_seq (filter #(<= 1 % 3) seq)
        new_seq (reduce (fn [comb x] (update-in comb [x :qtd] inc)) initial-comb filtered_seq)]
    (println "MUITO OBRIGADO")
    (doseq [[_ tipo] new_seq]
      (println ( format "%s: %d" (:name tipo) (:qtd tipo))))
    ))

(-main)
