(ns app.server
  (:require [coast]
            [app.routes :as routes])
  (:gen-class))

(def app (coast/app {:routes routes/routes}))

(defn -main [& [port]]
  (coast/server app {:port port}))

(comment
  (-main))
