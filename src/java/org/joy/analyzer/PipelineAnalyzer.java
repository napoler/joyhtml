package org.joy.analyzer;

import java.util.List;

public class PipelineAnalyzer<K, E> extends Analyzer<K, E> {
	protected Analyzer<Object, Object>[] analyzers;

	public PipelineAnalyzer(Analyzer<Object, Object>[] analyzers) {
		// TODO 要在这里添加检查类型套接的操作
		this.analyzers = analyzers;
	}

	@Override
	public void doAnalyze() {
		output = null;
		Object in = input;
		for (Analyzer<Object, Object> a : analyzers) {
			a.setDoc(doc);
			a.input(in);
			a.doAnalyze();
			in = a.output();
		}
		output = (E) in;
	}

}