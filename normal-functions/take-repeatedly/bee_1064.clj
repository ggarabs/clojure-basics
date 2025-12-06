(ns take-repeatedly.bee-1064)

(defn mean [values]
  (/ (apply + values) (count values)))

(defn -main [& _]
  (let [values (take 6 (repeatedly #(Double/parseDouble (read-line))))
        positive (filter pos? values)]
    (println (count positive) "valores positivos")
    (println (format "%.1f"(mean positive)))))

(-main)