(ns app.routes
  (:require [coast]
            [app.components :as components]))

(def routes
  (coast/site
    (coast/with-layout :app.components/layout
      [:get "/" :app.home/index])

    [:404 :app.home/not-found]
    [:500 :app.home/server-error]))
