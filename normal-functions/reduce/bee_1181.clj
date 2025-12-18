(ns bee-1181)

(defn -main [& _]
  (let [n 2
        l (Integer/parseInt (read-line))
        op (read-line)
        mtx (reduce 
             (fn [acc _]
               (let [curr (vec (for [_ (range n)]
                                 (Double/parseDouble (read-line))))]
                 (conj acc curr)))
             []
             (range n))
        sum (reduce + (get mtx l))
        mean (/ sum n)]
    (println (if (= "S" op) sum mean))))

(-main)
