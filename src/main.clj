(ns main)

(defn square [x] 
    (* x x))

(defn run [opts]
    (println "Hello world, the square of 7 is" (square 7)))