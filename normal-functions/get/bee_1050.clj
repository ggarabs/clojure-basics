(ns get.bee-1050)

(def destination 
  {61 "Brasilia"
  71 "Salvador"
  11 "Sao Paulo"
  21 "Rio de Janeiro"
  32 "Juiz de Fora"
  19 "Campinas"
  27 "Vitoria"
  31 "Belo Horizonte"})

(defn -main [& _]
  (let [ddd (Integer/parseInt (read-line))]
    (println (get destination ddd "DDD nao cadastrado"))))

(-main)