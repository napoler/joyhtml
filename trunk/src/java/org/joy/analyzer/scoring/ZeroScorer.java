/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joy.analyzer.scoring;

/**
 * 零分算法，给所有的关键词打0分
 * @note 需要传入的打分参数：无
 * @author Administrator
 */
public class ZeroScorer extends Scorer {

    public ZeroScorer() {
    }

    @Override
    public double getScore(String term) {
        return .0;
    }
}