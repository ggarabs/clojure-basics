(ns normal-functions.for.bee-1142)

(defn -main [& _]
  (let [n (read-string (read-line)) 
        result (apply str (for [i (range n)] 
                 (str (+ (* 4 i) 1) " " 
                      (+ (* 4 i) 2) " " 
                      (+ (* 4 i) 3) " PUM\n")))] 
    (print result)))

(-main)