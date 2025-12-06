(ns math.bee-1036
  (:gen-class) 
  (:require
    [clojure.string :as str]
    [clojure.math :as math]))

(defn delta [a b c] (- (math/pow b 2) (* 4 a c)))

(defn root [a b delta-squared] (/ (+ (- b) delta-squared) (* 2 a)))

(defn roots [a b c]
  (let [delta (delta a b c)] 
    (if (or (neg? delta) (zero? a)) 
      "Impossivel calcular" 
      (format "R1 = %.5f\nR2 = %.5f" (root a b (math/sqrt delta)) (root a b (- (math/sqrt delta)))))))

(defn -main [& _]
  (let [[a b c] (map read-string (str/split (read-line) #"\s+"))]
    (println (roots a b c))))

(-main)