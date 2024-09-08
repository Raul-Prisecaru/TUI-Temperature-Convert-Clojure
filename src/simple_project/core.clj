(ns simple-project.core
  (:gen-class))

(def celsius 0)
(def fahrenheit 0)
(def kelvin 0)

(defn CtoF
      [value]
      (println (+ (* value (/ 9 5)) 32)))

(defn CtoK
      [value]
      (println (+ value 273.15)))

(defn FtoC
      [value]
      (println (* (- value 32) (/ 5 9))))

(defn FtoK
      [value]
      (println (+ 273.15 (* (- value 32) (/ 5 9)))))



(defn KtoC
      [value]
      (println (- value 273.15)))

(defn KtoF
      [value]
      (println  (+ 32 (* 1.8 (- value  273.15)))))
;; Implement Readline

(defn together
      [option calValue]

      (if (= option 1)
        (do
          (println "Calculating Celsius to Fahrenheit")
          (println(CtoF calValue))))

      (if (= option 2)
        (do
          (println "Calculating Celsius to Kelvin")
          (CtoK calValue)))

      (if (= option 3)
        (do
          (println "Calculating Fahrenheit to Celsius")
          (FtoC calValue)))


      (if (= option 4)
        (do
          (println "Calculating Fahrenheit to Kelvin")
          (FtoK calValue)))


      (if (= option 5)
        (do
          (println "Calculating Kelvin to Celsius")
          (KtoC calValue)))


      (if (= option 6)
        (do
          (println "Calculating Kelvin to Fahrenheit")
          (KtoF calValue)))

      )


(defn -main
  []
      (println "[1] - Celsius to Fahrenheit" (newline)
               "[2] - Celsius to Kelvin"
               "[3] - Fahrenheit to Celsius"
               "[4] - Fahrenheit to Kelvin"
               "[5] - Kelvin to Celsius"
               "[6] - Kelvin to Fahrenheit")
      (def userOption (Integer/parseInt (read-line)))

      (println "Enter Value to Convert")
      (def userValue (Integer/parseInt (read-line)))



      (together userOption userValue))








