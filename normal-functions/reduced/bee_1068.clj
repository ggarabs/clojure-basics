(ns normal-functions.reduced.bee-1068)

(defn balanced? [str]
  (zero?
   (reduce
    (fn [acc curr]
      (cond
        (= curr \() (inc acc)
        (= curr \)) (if (pos? acc) 
                      (dec acc)
                      (reduced -1))
        :else acc)) 
    0 
    str)))

(defn -main [& _]
  (loop []
    (when-let [exp (read-line)]
      (let [filtered-exp (apply str (filter #(#{\( \)} %) exp))] 
        (println (if (balanced? filtered-exp) 
                   "correct" 
                   "incorrect")))
      (recur))))

(-main)