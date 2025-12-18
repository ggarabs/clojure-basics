(ns special-forms.loop.bee-1114)

(def secret-key 2002)

(defn -main [& _]
  (loop []
   (let [curr (Integer/parseInt (read-line))]
     (if (= curr secret-key)
       (println "Acesso Permitido")
       (do
         (println "Senha Invalida")
         (recur))))))

(-main)
