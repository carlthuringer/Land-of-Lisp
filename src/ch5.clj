(ns ch5
  (use [clojure.string :only (join)]))


(def ^:dynamic *nodes*
  {:living-room "you are in the living-room. a wizard is snoring loudly on the couch."
   :garden      "you are in a beautiful garden. a here is a well in front of you."
   :attic       "you are in the attic. there is a giant welding torch in the corner."})

(def ^:dynamic *edges*
  {:living-room ['[garden west door]
                '[attic upstairs ladder]]
   :garden ['[living-room east door]]
   :attic ['[living-room downstairs ladder]]})

(defn describe-location
  "Describe the location in the node map. Really it's just
  an alias for 'get'."
  [location nodes]
  (get location nodes))

(defn describe-path
  "Describes a path from the edges map."
  [edge]
  (str "there is a " (last edge) " going " (second edge) " from here."))


(defn describe-paths
  "Describe all paths from a location given an edges map"
  [location edges]
  (join " " (map describe-path (get *edges* :living-room))))
