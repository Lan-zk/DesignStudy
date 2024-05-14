package top.collin.strategymode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StrategyEnum {

    A(new ConcreteStrategyA()),
    B(new ConcreteStrategyB()),
    ;

    final Strategy strategy;

}
