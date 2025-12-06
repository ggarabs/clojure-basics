(ns destructuring.bee-1010
        (:gen-class))

(require '[clojure.string :as str])

(defn -main [& _]
        (let [[_ firstItemQuantityText firstItemValueText] (str/split (read-line) #"\s+")
              [_ secondItemQuantityText secondItemValueText] (str/split (read-line) #"\s+")

              firstItemQuantity (Integer/parseInt firstItemQuantityText)
              secondItemQuantity (Integer/parseInt secondItemQuantityText)

              firstItemValue (Double/parseDouble firstItemValueText)
              secondItemValue (Double/parseDouble secondItemValueText)

              firstItemTotalCost (* firstItemQuantity firstItemValue)
              secondItemTotalCost (* secondItemQuantity secondItemValue) 
              totalCost (+ firstItemTotalCost secondItemTotalCost) ]

              (println (format "VALOR A PAGAR: R$ %.2f" totalCost))))

(-main)