(ns git-bisect-tut.core-test
  (:require [clojure.test :refer :all]
            [git-bisect-tut.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest adder-test
  (is (= (adder 5 6) 11)))
