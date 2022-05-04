package com.godzy.cardgame.games;

public class EvaluatorFactory {
    public enum EvaluatorType {
        High,
        Normal,
        Test
    };

    public static GameEvaluator makeEvaluator(EvaluatorType type) {
        switch (type) {
            case High: return new HighEvaluator();
            case Normal: return new NormalEvaluator();
            case Test: return new TestEvaluator();
        }

        return new NormalEvaluator();
    }
}
