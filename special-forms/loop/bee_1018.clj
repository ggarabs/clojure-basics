(ns special-forms.loop.bee-1018)

(def banknotes [100 50 20 10 5 2 1])

(defn solve [x]
  (println x)
  (loop [[note & notes] banknotes
         value x]
    (when note
      (printf "%d nota(s) de R$ %d,00\n" (quot value note) note)
      (recur notes (mod value note)))))

(defn -main [& _] 
  (let [n (Integer/parseInt (read-line))] 
    (solve n)))

  (-main)