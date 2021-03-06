package com.lx.algos.ml.metrics

/**
  *
  * @project scalaML
  * @author lx on 1:57 PM 16/11/2017
  */

object ClassificationMetrics {
  def accuracy_score(y_true: Seq[Double], y_pred: Seq[Double]): Double = {
    assert(y_true.size == y_pred.size)

    {
      0 until y_true.size map {
        i =>
//          println(y_true(i), y_pred(i))
          if (y_true(i) == y_pred(i)) 1.0 else 0.0
      } reduce (_ + _)
    } / y_true.size
  }

  def avg_logloss(y_true: Seq[Double], y_pred: Seq[Double]): Double = {
    assert(y_true.size == y_pred.size)

    {
      0 until y_true.size map {
        i => Math.abs(y_true(i) - y_pred(i))
      } reduce(_+_)
    } / y_true.size
  }
}
