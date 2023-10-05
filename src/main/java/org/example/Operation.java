package org.example;

// 3. 기능별 옵션
// enum타입으로 switch문에서 operator 정리
public enum Operation {
    PLUS("+") {
        public double apply(double x, double y) {return x + y;}
    },
    MINUS("-") {
        public double apply(double x, double y) {return x - y;}
    },
    TIMES("*") {
        public double apply(double x, double y) {return x * y;}
    },
    DIVIDEBY("/") {
        public double apply(double x, double y) {return x / y;}
    };

    // symbol을 숨기기 위해 private, 값 변경을 하지 못하게 하기위해 final
    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double x, double y);

    @Override
    public String toString() { return symbol; }
}


