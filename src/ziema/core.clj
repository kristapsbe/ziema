; https://medium.com/@alekcz/http-kit-compojure-and-your-first-clojure-server-1df1b0c9da3d
(ns ziema.core
  (:gen-class)
  (:require [org.httpkit.server :as server]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defn baby-small-app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Pew pew!"})

(defn -main
  "This is our app's entry point"
  [& args]
  (let [port (Integer/parseInt (or (System/getenv "PORT") "8080"))]
  (server/run-server #'baby-small-app {:port port})
  (println (str "Running webserver at http:/127.0.0.1:" port "/"))))
