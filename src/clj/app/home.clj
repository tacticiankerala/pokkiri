(ns app.home
  (:require [coast]))


(defn index [request]
  [:h1 "You're coasting on clojure!"])


(defn not-found [request]
  [:html
   [:head
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    (coast/css "bundle.css")
    (coast/js "bundle.js")]
   [:body
    [:h1 "Couldn't find what you were looking for"]]])


(defn server-error [request]
  [:html
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     (coast/css "bundle.css")
     (coast/js "bundle.js")]
    [:body
     [:h1 "Something went wrong!"]]])
