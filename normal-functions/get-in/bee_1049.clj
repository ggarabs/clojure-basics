(ns get-in.bee-1049
  (:gen-class))

(def animals 
  {"vertebrado" {"ave" {"carnivoro" "aguia"
                        "onivoro" "pomba"}
                 "mamifero" {"onivoro" "homem"
                             "herbivoro" "vaca"}}
   "invertebrado" {"inseto" {"hematofago" "pulga"
                             "herbivoro" "lagarta"}
                   "anelideo" {"hematofago" "sanguessuga"
                               "onivoro" "minhoca"}}})


(defn -main [&  _]
  (let [w1 (read-line)
        w2 (read-line)
        w3 (read-line)]
    (println (get-in animals [w1 w2 w3]))))

(-main)