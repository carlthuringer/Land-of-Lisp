(ns ch4)

(defn my-length
  "Page 51 my-length function in clojure"
  [list]
  (if (empty? list)
    0
    (+ 1 (my-length (rest list)))))

(def ^:dynamic *arch-enemy* (atom nil))

(defn pudding-eater
  "Page 56 pudding-eater function in Clojure"
  [person]
  (cond (= person 'henry)
          (do (reset! *arch-enemy* 'stupid-lisp-alien)
          '(Curse you Lisp alien - you ate my pudding))
        (= person 'johnny)
          (do (reset! *arch-enemy* 'useless-old-johnny)
          '(I hope you choked on my pudding johnny))
        :else
          '(Why u eat my pudding stranger?)
        ))

(defn pudding-eater-case
  "Page 57 pudding-eater function in Clojure using case"
  [person]
  (case person
    henry
     (do (reset! *arch-enemy* 'stupid-lisp-alien)
     '(Curse you Lisp alien - you ate my pudding))
    johnny
     (do (reset! *arch-enemy* 'useless-old-johnny)
     '(I hope you choked on my pudding johnny))
    '(Why u eat my pudding stranger?)
    ))

