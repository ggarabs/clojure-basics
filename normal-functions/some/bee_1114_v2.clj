(ns normal-functions.some.bee-1114-v2)

(def secret-key 2002)

(defn -main [& _] 
   (some (fn [curr] 
           (when (= curr secret-key)
            (println "Acesso Permitido") 
            true))
         (repeatedly 
          (fn [] 
            (let [curr (Integer/parseInt (read-line))] 
              (when (not= curr secret-key) 
                (println "Senha Invalida")) 
              curr )))))

(-main)
