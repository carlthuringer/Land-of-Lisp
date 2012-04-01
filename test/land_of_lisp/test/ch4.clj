(ns land-of-lisp.test.ch4
  (:use [ch4])
  (:use [expectations]))

(expect 4 (my-length '(list with four symbols)))
(expect '(I hope you choked on my pudding johnny) (pudding-eater 'johnny))
(expect @*arch-enemy* 'useless-old-johnny)
(expect '(Curse you Lisp alien - you ate my pudding) (pudding-eater 'henry))
(expect @*arch-enemy* 'stupid-lisp-alien)
(expect '(Why u eat my pudding stranger?) (pudding-eater 'george-clooney))
;pudding-eater-case
(expect '(I hope you choked on my pudding johnny) (pudding-eater-case 'johnny))
(expect @*arch-enemy* 'useless-old-johnny)
(expect '(Curse you Lisp alien - you ate my pudding) (pudding-eater-case 'henry))
(expect @*arch-enemy* 'stupid-lisp-alien)
(expect '(Why u eat my pudding stranger?) (pudding-eater-case 'george-clooney))
