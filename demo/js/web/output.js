if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'output'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'output'.");
}
var output = function (_, Kotlin) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var Comparable = Kotlin.kotlin.Comparable;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var throwCCE = Kotlin.throwCCE;
  var numberToDouble = Kotlin.numberToDouble;
  var defineInlineFunction = Kotlin.defineInlineFunction;
  var wrapFunction = Kotlin.wrapFunction;
  var Math_0 = Math;
  var log = Kotlin.kotlin.math.log_lu1900$;
  times.prototype = Object.create(OperationProof.prototype);
  times.prototype.constructor = times;
  div.prototype = Object.create(OperationProof.prototype);
  div.prototype.constructor = div;
  function Quan() {
  }
  Quan.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Quan',
    interfaces: [Comparable]
  };
  function OperationProof() {
  }
  OperationProof.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'OperationProof',
    interfaces: []
  };
  function times() {
    times_instance = this;
    OperationProof.call(this);
  }
  times.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'times',
    interfaces: [OperationProof]
  };
  var times_instance = null;
  function times_getInstance() {
    if (times_instance === null) {
      new times();
    }
    return times_instance;
  }
  function div() {
    div_instance = this;
    OperationProof.call(this);
  }
  div.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'div',
    interfaces: [OperationProof]
  };
  var div_instance = null;
  function div_getInstance() {
    if (div_instance === null) {
      new div();
    }
    return div_instance;
  }
  function UomConverter() {
  }
  UomConverter.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'UomConverter',
    interfaces: []
  };
  function box(x) {
    var tmp$;
    return Kotlin.isType(tmp$ = x, Quan) ? tmp$ : throwCCE();
  }
  function L1A0M0T0I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M0T0I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M0T0I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'm';
    }
  });
  L1A0M0T0I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M0T0I0Theta0N0J0(siValue);
  };
  L1A0M0T0I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L1A0M0T0I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L1A0M0T0I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L1A0M0T0I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L1A0M0T0I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M0T0I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M0T0I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L1A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M0T0I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L1A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M0T0I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M0T0I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M0T0I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M0T0I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M0T0I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M0T0I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M0T0I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M0T0I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M0T0I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M0T0I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M0T0I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M0T0I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M0T0I0Theta0N0J0',
    interfaces: [Quan]
  };
  L1A0M0T0I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M0T0I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M0T0I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Metre = defineInlineFunction('output.info.kunalsheth.units.generated.get_Metre_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L1A0M0T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L1A0M0T0I0Theta0N0J0;
    return function ($receiver) {
      return new L1A0M0T0I0Theta0N0J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Metre_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Metre_m013fg$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Metre() {
    Metre_instance = this;
    this.$delegate_v0b98o$_0 = box(new L1A0M0T0I0Theta0N0J0(1.0));
    this.unitName_17lvjp$_0 = 'Metre';
  }
  Object.defineProperty(Metre.prototype, 'unitName', {
    get: function () {
      return this.unitName_17lvjp$_0;
    }
  });
  Metre.prototype.invoke_14dthe$ = function (x) {
    return new L1A0M0T0I0Theta0N0J0(numberToDouble(x) * 1.0);
  };
  Metre.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Metre.prototype, 'abrev', {
    get: function () {
      return this.$delegate_v0b98o$_0.abrev;
    }
  });
  Object.defineProperty(Metre.prototype, 'abs', {
    get: function () {
      return this.$delegate_v0b98o$_0.abs;
    }
  });
  Object.defineProperty(Metre.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_v0b98o$_0.isNegative;
    }
  });
  Object.defineProperty(Metre.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_v0b98o$_0.isPositive;
    }
  });
  Object.defineProperty(Metre.prototype, 'isZero', {
    get: function () {
      return this.$delegate_v0b98o$_0.isZero;
    }
  });
  Object.defineProperty(Metre.prototype, 'siValue', {
    get: function () {
      return this.$delegate_v0b98o$_0.siValue;
    }
  });
  Object.defineProperty(Metre.prototype, 'signum', {
    get: function () {
      return this.$delegate_v0b98o$_0.signum;
    }
  });
  Metre.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_v0b98o$_0.compareTo_11rb$(other);
  };
  Metre.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_v0b98o$_0.div_3p81yu$(that);
  };
  Metre.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_v0b98o$_0.max_j0rjbv$(that);
  };
  Metre.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_v0b98o$_0.min_j0rjbv$(that);
  };
  Metre.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_v0b98o$_0.minus_j0rjbv$(that);
  };
  Metre.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_v0b98o$_0.new_14dthe$(siValue);
  };
  Metre.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_v0b98o$_0.plus_j0rjbv$(that);
  };
  Metre.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_v0b98o$_0.rem_j0rjbv$(that);
  };
  Metre.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_v0b98o$_0.times_3p81yu$(that);
  };
  Metre.prototype.unaryMinus = function () {
    return this.$delegate_v0b98o$_0.unaryMinus();
  };
  Metre.prototype.unaryPlus = function () {
    return this.$delegate_v0b98o$_0.unaryPlus();
  };
  Metre.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Metre',
    interfaces: [Quan, UomConverter]
  };
  var Metre_instance = null;
  function Metre_getInstance() {
    if (Metre_instance === null) {
      new Metre();
    }
    return Metre_instance;
  }
  var get_Mile = defineInlineFunction('output.info.kunalsheth.units.generated.get_Mile_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L1A0M0T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L1A0M0T0I0Theta0N0J0;
    return function ($receiver) {
      return new L1A0M0T0I0Theta0N0J0_init(numberToDouble($receiver) * 1609.34);
    };
  }));
  var get_Mile_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Mile_m013fg$', function ($receiver) {
    return $receiver.siValue * 6.213727366498068E-4;
  });
  function Mile() {
    Mile_instance = this;
    this.$delegate_xdayrw$_0 = box(new L1A0M0T0I0Theta0N0J0(1609.34));
    this.unitName_aizqpj$_0 = 'Mile';
  }
  Object.defineProperty(Mile.prototype, 'unitName', {
    get: function () {
      return this.unitName_aizqpj$_0;
    }
  });
  Mile.prototype.invoke_14dthe$ = function (x) {
    return new L1A0M0T0I0Theta0N0J0(numberToDouble(x) * 1609.34);
  };
  Mile.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 6.213727366498068E-4;
  };
  Object.defineProperty(Mile.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xdayrw$_0.abrev;
    }
  });
  Object.defineProperty(Mile.prototype, 'abs', {
    get: function () {
      return this.$delegate_xdayrw$_0.abs;
    }
  });
  Object.defineProperty(Mile.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xdayrw$_0.isNegative;
    }
  });
  Object.defineProperty(Mile.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xdayrw$_0.isPositive;
    }
  });
  Object.defineProperty(Mile.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xdayrw$_0.isZero;
    }
  });
  Object.defineProperty(Mile.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xdayrw$_0.siValue;
    }
  });
  Object.defineProperty(Mile.prototype, 'signum', {
    get: function () {
      return this.$delegate_xdayrw$_0.signum;
    }
  });
  Mile.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xdayrw$_0.compareTo_11rb$(other);
  };
  Mile.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xdayrw$_0.div_3p81yu$(that);
  };
  Mile.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xdayrw$_0.max_j0rjbv$(that);
  };
  Mile.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xdayrw$_0.min_j0rjbv$(that);
  };
  Mile.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xdayrw$_0.minus_j0rjbv$(that);
  };
  Mile.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xdayrw$_0.new_14dthe$(siValue);
  };
  Mile.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xdayrw$_0.plus_j0rjbv$(that);
  };
  Mile.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xdayrw$_0.rem_j0rjbv$(that);
  };
  Mile.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xdayrw$_0.times_3p81yu$(that);
  };
  Mile.prototype.unaryMinus = function () {
    return this.$delegate_xdayrw$_0.unaryMinus();
  };
  Mile.prototype.unaryPlus = function () {
    return this.$delegate_xdayrw$_0.unaryPlus();
  };
  Mile.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Mile',
    interfaces: [Quan, UomConverter]
  };
  var Mile_instance = null;
  function Mile_getInstance() {
    if (Mile_instance === null) {
      new Mile();
    }
    return Mile_instance;
  }
  var get_Foot = defineInlineFunction('output.info.kunalsheth.units.generated.get_Foot_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L1A0M0T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L1A0M0T0I0Theta0N0J0;
    return function ($receiver) {
      return new L1A0M0T0I0Theta0N0J0_init(numberToDouble($receiver) * 0.3048);
    };
  }));
  var get_Foot_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Foot_m013fg$', function ($receiver) {
    return $receiver.siValue * 3.280839895013123;
  });
  function Foot() {
    Foot_instance = this;
    this.$delegate_xd6med$_0 = box(new L1A0M0T0I0Theta0N0J0(0.3048));
    this.unitName_5p8d2a$_0 = 'Foot';
  }
  Object.defineProperty(Foot.prototype, 'unitName', {
    get: function () {
      return this.unitName_5p8d2a$_0;
    }
  });
  Foot.prototype.invoke_14dthe$ = function (x) {
    return new L1A0M0T0I0Theta0N0J0(numberToDouble(x) * 0.3048);
  };
  Foot.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 3.280839895013123;
  };
  Object.defineProperty(Foot.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xd6med$_0.abrev;
    }
  });
  Object.defineProperty(Foot.prototype, 'abs', {
    get: function () {
      return this.$delegate_xd6med$_0.abs;
    }
  });
  Object.defineProperty(Foot.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xd6med$_0.isNegative;
    }
  });
  Object.defineProperty(Foot.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xd6med$_0.isPositive;
    }
  });
  Object.defineProperty(Foot.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xd6med$_0.isZero;
    }
  });
  Object.defineProperty(Foot.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xd6med$_0.siValue;
    }
  });
  Object.defineProperty(Foot.prototype, 'signum', {
    get: function () {
      return this.$delegate_xd6med$_0.signum;
    }
  });
  Foot.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xd6med$_0.compareTo_11rb$(other);
  };
  Foot.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xd6med$_0.div_3p81yu$(that);
  };
  Foot.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xd6med$_0.max_j0rjbv$(that);
  };
  Foot.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xd6med$_0.min_j0rjbv$(that);
  };
  Foot.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xd6med$_0.minus_j0rjbv$(that);
  };
  Foot.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xd6med$_0.new_14dthe$(siValue);
  };
  Foot.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xd6med$_0.plus_j0rjbv$(that);
  };
  Foot.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xd6med$_0.rem_j0rjbv$(that);
  };
  Foot.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xd6med$_0.times_3p81yu$(that);
  };
  Foot.prototype.unaryMinus = function () {
    return this.$delegate_xd6med$_0.unaryMinus();
  };
  Foot.prototype.unaryPlus = function () {
    return this.$delegate_xd6med$_0.unaryPlus();
  };
  Foot.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Foot',
    interfaces: [Quan, UomConverter]
  };
  var Foot_instance = null;
  function Foot_getInstance() {
    if (Foot_instance === null) {
      new Foot();
    }
    return Foot_instance;
  }
  function div_0($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_1($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_0($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_1($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_0(thiz, op, that) {
    return new L2A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_2($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_3($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_1(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function times_2($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_3($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_2(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_4($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_5($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_3(thiz, op, that) {
    return new L1A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_4($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_5($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_4(thiz, op, that) {
    return new L1A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_6($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_7($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_5(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_6($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_7($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_6(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function L0A0M0T0I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T0I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return '';
    }
  });
  L0A0M0T0I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T0I0Theta0N0J0(siValue);
  };
  L0A0M0T0I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A0M0T0I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A0M0T0I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T0I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T0I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T0I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T0I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T0I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T0I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T0I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T0I0Theta0N0J0',
    interfaces: [Quan]
  };
  L0A0M0T0I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T0I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T0I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Turn = defineInlineFunction('output.info.kunalsheth.units.generated.get_Turn_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M0T0I0Theta0N0J0_init(numberToDouble($receiver) * 6.283185307179586);
    };
  }));
  var get_Turn_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Turn_f8mkmz$', function ($receiver) {
    return $receiver.siValue * 0.15915494309189535;
  });
  function Turn() {
    Turn_instance = this;
    this.$delegate_xdfoqc$_0 = box(new L0A0M0T0I0Theta0N0J0(6.283185307179586));
    this.unitName_qs8brj$_0 = 'Turn';
  }
  Object.defineProperty(Turn.prototype, 'unitName', {
    get: function () {
      return this.unitName_qs8brj$_0;
    }
  });
  Turn.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T0I0Theta0N0J0(numberToDouble(x) * 6.283185307179586);
  };
  Turn.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 0.15915494309189535;
  };
  Object.defineProperty(Turn.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xdfoqc$_0.abrev;
    }
  });
  Object.defineProperty(Turn.prototype, 'abs', {
    get: function () {
      return this.$delegate_xdfoqc$_0.abs;
    }
  });
  Object.defineProperty(Turn.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xdfoqc$_0.isNegative;
    }
  });
  Object.defineProperty(Turn.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xdfoqc$_0.isPositive;
    }
  });
  Object.defineProperty(Turn.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xdfoqc$_0.isZero;
    }
  });
  Object.defineProperty(Turn.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xdfoqc$_0.siValue;
    }
  });
  Object.defineProperty(Turn.prototype, 'signum', {
    get: function () {
      return this.$delegate_xdfoqc$_0.signum;
    }
  });
  Turn.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xdfoqc$_0.compareTo_11rb$(other);
  };
  Turn.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xdfoqc$_0.div_3p81yu$(that);
  };
  Turn.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xdfoqc$_0.max_j0rjbv$(that);
  };
  Turn.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xdfoqc$_0.min_j0rjbv$(that);
  };
  Turn.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xdfoqc$_0.minus_j0rjbv$(that);
  };
  Turn.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xdfoqc$_0.new_14dthe$(siValue);
  };
  Turn.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xdfoqc$_0.plus_j0rjbv$(that);
  };
  Turn.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xdfoqc$_0.rem_j0rjbv$(that);
  };
  Turn.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xdfoqc$_0.times_3p81yu$(that);
  };
  Turn.prototype.unaryMinus = function () {
    return this.$delegate_xdfoqc$_0.unaryMinus();
  };
  Turn.prototype.unaryPlus = function () {
    return this.$delegate_xdfoqc$_0.unaryPlus();
  };
  Turn.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Turn',
    interfaces: [Quan, UomConverter]
  };
  var Turn_instance = null;
  function Turn_getInstance() {
    if (Turn_instance === null) {
      new Turn();
    }
    return Turn_instance;
  }
  var get_Degree = defineInlineFunction('output.info.kunalsheth.units.generated.get_Degree_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M0T0I0Theta0N0J0_init(numberToDouble($receiver) * 0.017453292519943295);
    };
  }));
  var get_Degree_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Degree_f8mkmz$', function ($receiver) {
    return $receiver.siValue * 57.29577951308232;
  });
  function Degree() {
    Degree_instance = this;
    this.$delegate_sw8ww3$_0 = box(new L0A0M0T0I0Theta0N0J0(0.017453292519943295));
    this.unitName_u7fe4g$_0 = 'Degree';
  }
  Object.defineProperty(Degree.prototype, 'unitName', {
    get: function () {
      return this.unitName_u7fe4g$_0;
    }
  });
  Degree.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T0I0Theta0N0J0(numberToDouble(x) * 0.017453292519943295);
  };
  Degree.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 57.29577951308232;
  };
  Object.defineProperty(Degree.prototype, 'abrev', {
    get: function () {
      return this.$delegate_sw8ww3$_0.abrev;
    }
  });
  Object.defineProperty(Degree.prototype, 'abs', {
    get: function () {
      return this.$delegate_sw8ww3$_0.abs;
    }
  });
  Object.defineProperty(Degree.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_sw8ww3$_0.isNegative;
    }
  });
  Object.defineProperty(Degree.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_sw8ww3$_0.isPositive;
    }
  });
  Object.defineProperty(Degree.prototype, 'isZero', {
    get: function () {
      return this.$delegate_sw8ww3$_0.isZero;
    }
  });
  Object.defineProperty(Degree.prototype, 'siValue', {
    get: function () {
      return this.$delegate_sw8ww3$_0.siValue;
    }
  });
  Object.defineProperty(Degree.prototype, 'signum', {
    get: function () {
      return this.$delegate_sw8ww3$_0.signum;
    }
  });
  Degree.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_sw8ww3$_0.compareTo_11rb$(other);
  };
  Degree.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_sw8ww3$_0.div_3p81yu$(that);
  };
  Degree.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_sw8ww3$_0.max_j0rjbv$(that);
  };
  Degree.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_sw8ww3$_0.min_j0rjbv$(that);
  };
  Degree.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_sw8ww3$_0.minus_j0rjbv$(that);
  };
  Degree.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_sw8ww3$_0.new_14dthe$(siValue);
  };
  Degree.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_sw8ww3$_0.plus_j0rjbv$(that);
  };
  Degree.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_sw8ww3$_0.rem_j0rjbv$(that);
  };
  Degree.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_sw8ww3$_0.times_3p81yu$(that);
  };
  Degree.prototype.unaryMinus = function () {
    return this.$delegate_sw8ww3$_0.unaryMinus();
  };
  Degree.prototype.unaryPlus = function () {
    return this.$delegate_sw8ww3$_0.unaryPlus();
  };
  Degree.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Degree',
    interfaces: [Quan, UomConverter]
  };
  var Degree_instance = null;
  function Degree_getInstance() {
    if (Degree_instance === null) {
      new Degree();
    }
    return Degree_instance;
  }
  var get_Percent = defineInlineFunction('output.info.kunalsheth.units.generated.get_Percent_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M0T0I0Theta0N0J0_init(numberToDouble($receiver) * 0.01);
    };
  }));
  var get_Percent_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Percent_f8mkmz$', function ($receiver) {
    return $receiver.siValue * 100.0;
  });
  function Percent() {
    Percent_instance = this;
    this.$delegate_6lj2pa$_0 = box(new L0A0M0T0I0Theta0N0J0(0.01));
    this.unitName_8dqf85$_0 = 'Percent';
  }
  Object.defineProperty(Percent.prototype, 'unitName', {
    get: function () {
      return this.unitName_8dqf85$_0;
    }
  });
  Percent.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T0I0Theta0N0J0(numberToDouble(x) * 0.01);
  };
  Percent.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 100.0;
  };
  Object.defineProperty(Percent.prototype, 'abrev', {
    get: function () {
      return this.$delegate_6lj2pa$_0.abrev;
    }
  });
  Object.defineProperty(Percent.prototype, 'abs', {
    get: function () {
      return this.$delegate_6lj2pa$_0.abs;
    }
  });
  Object.defineProperty(Percent.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_6lj2pa$_0.isNegative;
    }
  });
  Object.defineProperty(Percent.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_6lj2pa$_0.isPositive;
    }
  });
  Object.defineProperty(Percent.prototype, 'isZero', {
    get: function () {
      return this.$delegate_6lj2pa$_0.isZero;
    }
  });
  Object.defineProperty(Percent.prototype, 'siValue', {
    get: function () {
      return this.$delegate_6lj2pa$_0.siValue;
    }
  });
  Object.defineProperty(Percent.prototype, 'signum', {
    get: function () {
      return this.$delegate_6lj2pa$_0.signum;
    }
  });
  Percent.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_6lj2pa$_0.compareTo_11rb$(other);
  };
  Percent.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_6lj2pa$_0.div_3p81yu$(that);
  };
  Percent.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_6lj2pa$_0.max_j0rjbv$(that);
  };
  Percent.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_6lj2pa$_0.min_j0rjbv$(that);
  };
  Percent.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_6lj2pa$_0.minus_j0rjbv$(that);
  };
  Percent.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_6lj2pa$_0.new_14dthe$(siValue);
  };
  Percent.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_6lj2pa$_0.plus_j0rjbv$(that);
  };
  Percent.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_6lj2pa$_0.rem_j0rjbv$(that);
  };
  Percent.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_6lj2pa$_0.times_3p81yu$(that);
  };
  Percent.prototype.unaryMinus = function () {
    return this.$delegate_6lj2pa$_0.unaryMinus();
  };
  Percent.prototype.unaryPlus = function () {
    return this.$delegate_6lj2pa$_0.unaryPlus();
  };
  Percent.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Percent',
    interfaces: [Quan, UomConverter]
  };
  var Percent_instance = null;
  function Percent_getInstance() {
    if (Percent_instance === null) {
      new Percent();
    }
    return Percent_instance;
  }
  function div_8($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_9($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_7(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_8($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_9($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_8(thiz, op, that) {
    return new L1A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_10($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_11($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_9(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_12($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_13($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_10(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_14($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_15($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_11(thiz, op, that) {
    return new L2A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_10($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function div_11($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function p_12(thiz, op, that) {
    return new A0M0T1I0Theta0N0J0_per_L1(thiz.siValue / that.siValue);
  }
  function times_16($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function times_17($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function p_13(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue * that.siValue);
  }
  function times_18($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_19($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_14(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_12($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_13($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_15(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function times_20($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue * that.siValue);
  }
  function times_21($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue * that.siValue);
  }
  function p_16(thiz, op, that) {
    return new A0M0T1I0Theta0N0J0_per_L1(thiz.siValue * that.siValue);
  }
  function times_22($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_23($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_17(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_24($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_25($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_18(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function times_26($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_27($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_19(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_14($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_15($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_20(thiz, op, that) {
    return new L0A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function times_28($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_29($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_21(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function div_16($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_17($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_22(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_30($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function times_31($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function p_23(thiz, op, that) {
    return new L0A0M0I0Theta0N0J0_per_T1(thiz.siValue * that.siValue);
  }
  function times_32($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function times_33($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function p_24(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T4(thiz.siValue * that.siValue);
  }
  function times_34($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_35($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_25(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function times_36($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function times_37($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function p_26(thiz, op, that) {
    return new L4A0M2I0Theta0N0J0_per_T6(thiz.siValue * that.siValue);
  }
  function div_18($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function div_19($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function p_27(thiz, op, that) {
    return new A0T4I0Theta0N0J0_per_L2M1(thiz.siValue / that.siValue);
  }
  function times_38($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function times_39($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function p_28(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T4(thiz.siValue * that.siValue);
  }
  function times_40($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_41($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_29(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_20($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function div_21($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function p_30(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T4(thiz.siValue / that.siValue);
  }
  function times_42($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue * that.siValue);
  }
  function times_43($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue * that.siValue);
  }
  function p_31(thiz, op, that) {
    return new A0T4I0Theta0N0J0_per_L2M1(thiz.siValue * that.siValue);
  }
  function L2A0M0T0I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M0T0I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M0T0I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'm\xB2';
    }
  });
  L2A0M0T0I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M0T0I0Theta0N0J0(siValue);
  };
  L2A0M0T0I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L2A0M0T0I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L2A0M0T0I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L2A0M0T0I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L2A0M0T0I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M0T0I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M0T0I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L2A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M0T0I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L2A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M0T0I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M0T0I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M0T0I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M0T0I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M0T0I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M0T0I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M0T0I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M0T0I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M0T0I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M0T0I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M0T0I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M0T0I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M0T0I0Theta0N0J0',
    interfaces: [Quan]
  };
  L2A0M0T0I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M0T0I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M0T0I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_22($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_23($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_32(thiz, op, that) {
    return new L1A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_24($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_25($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_33(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_26($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_27($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_34(thiz, op, that) {
    return new L2A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_44($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_45($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_35(thiz, op, that) {
    return new L2A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_28($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_29($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_36(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_30($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_31($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_37(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function times_46($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_47($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_38(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function L0A0M0T1I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T1I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 's';
    }
  });
  L0A0M0T1I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T1I0Theta0N0J0(siValue);
  };
  L0A0M0T1I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A0M0T1I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A0M0T1I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T1I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T1I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T1I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T1I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T1I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T1I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T1I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T1I0Theta0N0J0',
    interfaces: [Quan]
  };
  L0A0M0T1I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T1I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T1I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Second = defineInlineFunction('output.info.kunalsheth.units.generated.get_Second_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T1I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T1I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M0T1I0Theta0N0J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Second_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Second_nlmg64$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Second() {
    Second_instance = this;
    this.$delegate_z19f4l$_0 = box(new L0A0M0T1I0Theta0N0J0(1.0));
    this.unitName_hm5t4$_0 = 'Second';
  }
  Object.defineProperty(Second.prototype, 'unitName', {
    get: function () {
      return this.unitName_hm5t4$_0;
    }
  });
  Second.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T1I0Theta0N0J0(numberToDouble(x) * 1.0);
  };
  Second.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Second.prototype, 'abrev', {
    get: function () {
      return this.$delegate_z19f4l$_0.abrev;
    }
  });
  Object.defineProperty(Second.prototype, 'abs', {
    get: function () {
      return this.$delegate_z19f4l$_0.abs;
    }
  });
  Object.defineProperty(Second.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_z19f4l$_0.isNegative;
    }
  });
  Object.defineProperty(Second.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_z19f4l$_0.isPositive;
    }
  });
  Object.defineProperty(Second.prototype, 'isZero', {
    get: function () {
      return this.$delegate_z19f4l$_0.isZero;
    }
  });
  Object.defineProperty(Second.prototype, 'siValue', {
    get: function () {
      return this.$delegate_z19f4l$_0.siValue;
    }
  });
  Object.defineProperty(Second.prototype, 'signum', {
    get: function () {
      return this.$delegate_z19f4l$_0.signum;
    }
  });
  Second.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_z19f4l$_0.compareTo_11rb$(other);
  };
  Second.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_z19f4l$_0.div_3p81yu$(that);
  };
  Second.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_z19f4l$_0.max_j0rjbv$(that);
  };
  Second.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_z19f4l$_0.min_j0rjbv$(that);
  };
  Second.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_z19f4l$_0.minus_j0rjbv$(that);
  };
  Second.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_z19f4l$_0.new_14dthe$(siValue);
  };
  Second.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_z19f4l$_0.plus_j0rjbv$(that);
  };
  Second.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_z19f4l$_0.rem_j0rjbv$(that);
  };
  Second.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_z19f4l$_0.times_3p81yu$(that);
  };
  Second.prototype.unaryMinus = function () {
    return this.$delegate_z19f4l$_0.unaryMinus();
  };
  Second.prototype.unaryPlus = function () {
    return this.$delegate_z19f4l$_0.unaryPlus();
  };
  Second.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Second',
    interfaces: [Quan, UomConverter]
  };
  var Second_instance = null;
  function Second_getInstance() {
    if (Second_instance === null) {
      new Second();
    }
    return Second_instance;
  }
  var get_Hour = defineInlineFunction('output.info.kunalsheth.units.generated.get_Hour_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T1I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T1I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M0T1I0Theta0N0J0_init(numberToDouble($receiver) * 3600.0);
    };
  }));
  var get_Hour_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Hour_nlmg64$', function ($receiver) {
    return $receiver.siValue * 2.777777777777778E-4;
  });
  function Hour() {
    Hour_instance = this;
    this.$delegate_xd7wij$_0 = box(new L0A0M0T1I0Theta0N0J0(3600.0));
    this.unitName_9t1hpk$_0 = 'Hour';
  }
  Object.defineProperty(Hour.prototype, 'unitName', {
    get: function () {
      return this.unitName_9t1hpk$_0;
    }
  });
  Hour.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T1I0Theta0N0J0(numberToDouble(x) * 3600.0);
  };
  Hour.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 2.777777777777778E-4;
  };
  Object.defineProperty(Hour.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xd7wij$_0.abrev;
    }
  });
  Object.defineProperty(Hour.prototype, 'abs', {
    get: function () {
      return this.$delegate_xd7wij$_0.abs;
    }
  });
  Object.defineProperty(Hour.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xd7wij$_0.isNegative;
    }
  });
  Object.defineProperty(Hour.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xd7wij$_0.isPositive;
    }
  });
  Object.defineProperty(Hour.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xd7wij$_0.isZero;
    }
  });
  Object.defineProperty(Hour.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xd7wij$_0.siValue;
    }
  });
  Object.defineProperty(Hour.prototype, 'signum', {
    get: function () {
      return this.$delegate_xd7wij$_0.signum;
    }
  });
  Hour.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xd7wij$_0.compareTo_11rb$(other);
  };
  Hour.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xd7wij$_0.div_3p81yu$(that);
  };
  Hour.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xd7wij$_0.max_j0rjbv$(that);
  };
  Hour.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xd7wij$_0.min_j0rjbv$(that);
  };
  Hour.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xd7wij$_0.minus_j0rjbv$(that);
  };
  Hour.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xd7wij$_0.new_14dthe$(siValue);
  };
  Hour.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xd7wij$_0.plus_j0rjbv$(that);
  };
  Hour.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xd7wij$_0.rem_j0rjbv$(that);
  };
  Hour.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xd7wij$_0.times_3p81yu$(that);
  };
  Hour.prototype.unaryMinus = function () {
    return this.$delegate_xd7wij$_0.unaryMinus();
  };
  Hour.prototype.unaryPlus = function () {
    return this.$delegate_xd7wij$_0.unaryPlus();
  };
  Hour.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Hour',
    interfaces: [Quan, UomConverter]
  };
  var Hour_instance = null;
  function Hour_getInstance() {
    if (Hour_instance === null) {
      new Hour();
    }
    return Hour_instance;
  }
  var get_Minute = defineInlineFunction('output.info.kunalsheth.units.generated.get_Minute_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T1I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T1I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M0T1I0Theta0N0J0_init(numberToDouble($receiver) * 60.0);
    };
  }));
  var get_Minute_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Minute_nlmg64$', function ($receiver) {
    return $receiver.siValue * 0.016666666666666666;
  });
  function Minute() {
    Minute_instance = this;
    this.$delegate_x7z8az$_0 = box(new L0A0M0T1I0Theta0N0J0(60.0));
    this.unitName_cvsa6g$_0 = 'Minute';
  }
  Object.defineProperty(Minute.prototype, 'unitName', {
    get: function () {
      return this.unitName_cvsa6g$_0;
    }
  });
  Minute.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T1I0Theta0N0J0(numberToDouble(x) * 60.0);
  };
  Minute.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 0.016666666666666666;
  };
  Object.defineProperty(Minute.prototype, 'abrev', {
    get: function () {
      return this.$delegate_x7z8az$_0.abrev;
    }
  });
  Object.defineProperty(Minute.prototype, 'abs', {
    get: function () {
      return this.$delegate_x7z8az$_0.abs;
    }
  });
  Object.defineProperty(Minute.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_x7z8az$_0.isNegative;
    }
  });
  Object.defineProperty(Minute.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_x7z8az$_0.isPositive;
    }
  });
  Object.defineProperty(Minute.prototype, 'isZero', {
    get: function () {
      return this.$delegate_x7z8az$_0.isZero;
    }
  });
  Object.defineProperty(Minute.prototype, 'siValue', {
    get: function () {
      return this.$delegate_x7z8az$_0.siValue;
    }
  });
  Object.defineProperty(Minute.prototype, 'signum', {
    get: function () {
      return this.$delegate_x7z8az$_0.signum;
    }
  });
  Minute.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_x7z8az$_0.compareTo_11rb$(other);
  };
  Minute.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_x7z8az$_0.div_3p81yu$(that);
  };
  Minute.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_x7z8az$_0.max_j0rjbv$(that);
  };
  Minute.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_x7z8az$_0.min_j0rjbv$(that);
  };
  Minute.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_x7z8az$_0.minus_j0rjbv$(that);
  };
  Minute.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_x7z8az$_0.new_14dthe$(siValue);
  };
  Minute.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_x7z8az$_0.plus_j0rjbv$(that);
  };
  Minute.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_x7z8az$_0.rem_j0rjbv$(that);
  };
  Minute.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_x7z8az$_0.times_3p81yu$(that);
  };
  Minute.prototype.unaryMinus = function () {
    return this.$delegate_x7z8az$_0.unaryMinus();
  };
  Minute.prototype.unaryPlus = function () {
    return this.$delegate_x7z8az$_0.unaryPlus();
  };
  Minute.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Minute',
    interfaces: [Quan, UomConverter]
  };
  var Minute_instance = null;
  function Minute_getInstance() {
    if (Minute_instance === null) {
      new Minute();
    }
    return Minute_instance;
  }
  function div_32($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function div_33($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function p_39(thiz, op, that) {
    return new A0M0T1I0Theta0N0J0_per_L1(thiz.siValue / that.siValue);
  }
  function div_34($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_35($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_40(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_48($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_49($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_41(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_50($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_51($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_42(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_36($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_37($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_43(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_52($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_53($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_44(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_54($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_55($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_45(thiz, op, that) {
    return new L1A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_38($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_39($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_46(thiz, op, that) {
    return new L1A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_56($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function times_57($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function p_47(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue * that.siValue);
  }
  function times_58($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_59($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_48(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function times_60($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_61($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_49(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_62($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_63($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_50(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function div_40($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function div_41($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function p_51(thiz, op, that) {
    return new A0T4I0Theta0N0J0_per_L2M1(thiz.siValue / that.siValue);
  }
  function times_64($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_65($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_52(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function times_66($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_67($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_53(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function div_42($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function div_43($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function p_54(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T3(thiz.siValue / that.siValue);
  }
  function L1A0M0I0Theta0N0J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5s\u207B\xB9';
    }
  });
  L1A0M0I0Theta0N0J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M0I0Theta0N0J0_per_T1(siValue);
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.unaryPlus = function () {
    return new L1A0M0I0Theta0N0J0_per_T1(+this.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.unaryMinus = function () {
    return new L1A0M0I0Theta0N0J0_per_T1(-this.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M0I0Theta0N0J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M0I0Theta0N0J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M0I0Theta0N0J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M0I0Theta0N0J0_per_T1',
    interfaces: [Quan]
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M0I0Theta0N0J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_44($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_45($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_55(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_68($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_69($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_56(thiz, op, that) {
    return new L1A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_46($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_47($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_57(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function times_70($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function times_71($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function p_58(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue * that.siValue);
  }
  function times_72($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_73($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_59(thiz, op, that) {
    return new L2A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_74($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_75($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_60(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_76($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_77($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_61(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_78($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_79($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_62(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_48($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_49($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_63(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_80($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_81($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_64(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function div_50($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_51($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_65(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function times_82($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_83($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_66(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function L1A0M0T1I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M0T1I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M0T1I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5s';
    }
  });
  L1A0M0T1I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M0T1I0Theta0N0J0(siValue);
  };
  L1A0M0T1I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L1A0M0T1I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L1A0M0T1I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L1A0M0T1I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L1A0M0T1I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M0T1I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M0T1I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L1A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M0T1I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L1A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M0T1I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M0T1I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M0T1I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M0T1I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M0T1I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M0T1I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M0T1I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M0T1I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M0T1I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M0T1I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M0T1I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M0T1I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M0T1I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M0T1I0Theta0N0J0',
    interfaces: [Quan]
  };
  L1A0M0T1I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M0T1I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M0T1I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_52($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_53($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_67(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_54($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_55($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_68(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_56($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_57($receiver, that) {
    return new L1A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_69(thiz, op, that) {
    return new L1A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_58($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_59($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_70(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_84($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_85($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_71(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_60($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function div_61($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function p_72(thiz, op, that) {
    return new A0M0T1I0Theta0N0J0_per_L1(thiz.siValue / that.siValue);
  }
  function div_62($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_63($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_73(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_86($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_87($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_74(thiz, op, that) {
    return new L2A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_64($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_65($receiver, that) {
    return new L2A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_75(thiz, op, that) {
    return new L2A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_88($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_89($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_76(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_66($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_67($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_77(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function A0M0T1I0Theta0N0J0_per_L1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T1I0Theta0N0J0_per_L1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J0_per_L1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5s';
    }
  });
  A0M0T1I0Theta0N0J0_per_L1.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T1I0Theta0N0J0_per_L1(siValue);
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.unaryPlus = function () {
    return new A0M0T1I0Theta0N0J0_per_L1(+this.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.unaryMinus = function () {
    return new A0M0T1I0Theta0N0J0_per_L1(-this.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T1I0Theta0N0J0_per_L1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T1I0Theta0N0J0_per_L1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.times_3p81yu$ = function (that) {
    return new A0M0T1I0Theta0N0J0_per_L1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.div_3p81yu$ = function (that) {
    return new A0M0T1I0Theta0N0J0_per_L1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T1I0Theta0N0J0_per_L1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T1I0Theta0N0J0_per_L1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T1I0Theta0N0J0_per_L1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J0_per_L1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J0_per_L1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J0_per_L1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J0_per_L1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T1I0Theta0N0J0_per_L1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T1I0Theta0N0J0_per_L1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T1I0Theta0N0J0_per_L1',
    interfaces: [Quan]
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T1I0Theta0N0J0_per_L1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_68($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_69($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_78(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_90($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_91($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_79(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_70($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function div_71($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function p_80(thiz, op, that) {
    return new A0M0T1I0Theta0N0J0_per_L1(thiz.siValue / that.siValue);
  }
  function times_92($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue * that.siValue);
  }
  function times_93($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue * that.siValue);
  }
  function p_81(thiz, op, that) {
    return new A0M0T1I0Theta0N0J0_per_L1(thiz.siValue * that.siValue);
  }
  function times_94($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_95($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_82(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_96($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_97($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_83(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_98($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_99($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_84(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function L0A0M0T2I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T2I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T2I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 's\xB2';
    }
  });
  L0A0M0T2I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T2I0Theta0N0J0(siValue);
  };
  L0A0M0T2I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A0M0T2I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A0M0T2I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A0M0T2I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A0M0T2I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T2I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T2I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T2I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T2I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T2I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T2I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T2I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T2I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T2I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T2I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T2I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T2I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T2I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T2I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T2I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T2I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T2I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T2I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T2I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T2I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T2I0Theta0N0J0',
    interfaces: [Quan]
  };
  L0A0M0T2I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T2I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T2I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_72($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_73($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_85(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_74($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_75($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_86(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_76($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_77($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_87(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_100($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_101($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_88(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_102($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_103($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_89(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_78($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function div_79($receiver, that) {
    return new A0M0T1I0Theta0N0J0_per_L1($receiver.siValue / that.siValue);
  }
  function p_90(thiz, op, that) {
    return new A0M0T1I0Theta0N0J0_per_L1(thiz.siValue / that.siValue);
  }
  function div_80($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_81($receiver, that) {
    return new L1A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_91(thiz, op, that) {
    return new L1A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_104($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_105($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_92(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_82($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function div_83($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function p_93(thiz, op, that) {
    return new A0T4I0Theta0N0J0_per_L2M1(thiz.siValue / that.siValue);
  }
  function div_84($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_85($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_94(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function L2A0M0I0Theta0N0J0_per_T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T2.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5s\u207B\xB2';
    }
  });
  L2A0M0I0Theta0N0J0_per_T2.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M0I0Theta0N0J0_per_T2(siValue);
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.unaryPlus = function () {
    return new L2A0M0I0Theta0N0J0_per_T2(+this.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.unaryMinus = function () {
    return new L2A0M0I0Theta0N0J0_per_T2(-this.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.times_3p81yu$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.div_3p81yu$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M0I0Theta0N0J0_per_T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M0I0Theta0N0J0_per_T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M0I0Theta0N0J0_per_T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M0I0Theta0N0J0_per_T2',
    interfaces: [Quan]
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M0I0Theta0N0J0_per_T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Gray = defineInlineFunction('output.info.kunalsheth.units.generated.get_Gray_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L2A0M0I0Theta0N0J0_per_T2_init = _.info.kunalsheth.units.generated.L2A0M0I0Theta0N0J0_per_T2;
    return function ($receiver) {
      return new L2A0M0I0Theta0N0J0_per_T2_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Gray_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Gray_vunwxs$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Gray() {
    Gray_instance = this;
    this.$delegate_xd7ba2$_0 = box(new L2A0M0I0Theta0N0J0_per_T2(1.0));
    this.unitName_heaj13$_0 = 'Gray';
  }
  Object.defineProperty(Gray.prototype, 'unitName', {
    get: function () {
      return this.unitName_heaj13$_0;
    }
  });
  Gray.prototype.invoke_14dthe$ = function (x) {
    return new L2A0M0I0Theta0N0J0_per_T2(numberToDouble(x) * 1.0);
  };
  Gray.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Gray.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xd7ba2$_0.abrev;
    }
  });
  Object.defineProperty(Gray.prototype, 'abs', {
    get: function () {
      return this.$delegate_xd7ba2$_0.abs;
    }
  });
  Object.defineProperty(Gray.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xd7ba2$_0.isNegative;
    }
  });
  Object.defineProperty(Gray.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xd7ba2$_0.isPositive;
    }
  });
  Object.defineProperty(Gray.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xd7ba2$_0.isZero;
    }
  });
  Object.defineProperty(Gray.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xd7ba2$_0.siValue;
    }
  });
  Object.defineProperty(Gray.prototype, 'signum', {
    get: function () {
      return this.$delegate_xd7ba2$_0.signum;
    }
  });
  Gray.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xd7ba2$_0.compareTo_11rb$(other);
  };
  Gray.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xd7ba2$_0.div_3p81yu$(that);
  };
  Gray.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xd7ba2$_0.max_j0rjbv$(that);
  };
  Gray.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xd7ba2$_0.min_j0rjbv$(that);
  };
  Gray.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xd7ba2$_0.minus_j0rjbv$(that);
  };
  Gray.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xd7ba2$_0.new_14dthe$(siValue);
  };
  Gray.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xd7ba2$_0.plus_j0rjbv$(that);
  };
  Gray.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xd7ba2$_0.rem_j0rjbv$(that);
  };
  Gray.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xd7ba2$_0.times_3p81yu$(that);
  };
  Gray.prototype.unaryMinus = function () {
    return this.$delegate_xd7ba2$_0.unaryMinus();
  };
  Gray.prototype.unaryPlus = function () {
    return this.$delegate_xd7ba2$_0.unaryPlus();
  };
  Gray.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Gray',
    interfaces: [Quan, UomConverter]
  };
  var Gray_instance = null;
  function Gray_getInstance() {
    if (Gray_instance === null) {
      new Gray();
    }
    return Gray_instance;
  }
  var get_Sievert = defineInlineFunction('output.info.kunalsheth.units.generated.get_Sievert_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L2A0M0I0Theta0N0J0_per_T2_init = _.info.kunalsheth.units.generated.L2A0M0I0Theta0N0J0_per_T2;
    return function ($receiver) {
      return new L2A0M0I0Theta0N0J0_per_T2_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Sievert_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Sievert_vunwxs$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Sievert() {
    Sievert_instance = this;
    this.$delegate_ip0tw7$_0 = box(new L2A0M0I0Theta0N0J0_per_T2(1.0));
    this.unitName_n9hjx6$_0 = 'Sievert';
  }
  Object.defineProperty(Sievert.prototype, 'unitName', {
    get: function () {
      return this.unitName_n9hjx6$_0;
    }
  });
  Sievert.prototype.invoke_14dthe$ = function (x) {
    return new L2A0M0I0Theta0N0J0_per_T2(numberToDouble(x) * 1.0);
  };
  Sievert.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Sievert.prototype, 'abrev', {
    get: function () {
      return this.$delegate_ip0tw7$_0.abrev;
    }
  });
  Object.defineProperty(Sievert.prototype, 'abs', {
    get: function () {
      return this.$delegate_ip0tw7$_0.abs;
    }
  });
  Object.defineProperty(Sievert.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_ip0tw7$_0.isNegative;
    }
  });
  Object.defineProperty(Sievert.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_ip0tw7$_0.isPositive;
    }
  });
  Object.defineProperty(Sievert.prototype, 'isZero', {
    get: function () {
      return this.$delegate_ip0tw7$_0.isZero;
    }
  });
  Object.defineProperty(Sievert.prototype, 'siValue', {
    get: function () {
      return this.$delegate_ip0tw7$_0.siValue;
    }
  });
  Object.defineProperty(Sievert.prototype, 'signum', {
    get: function () {
      return this.$delegate_ip0tw7$_0.signum;
    }
  });
  Sievert.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_ip0tw7$_0.compareTo_11rb$(other);
  };
  Sievert.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_ip0tw7$_0.div_3p81yu$(that);
  };
  Sievert.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_ip0tw7$_0.max_j0rjbv$(that);
  };
  Sievert.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_ip0tw7$_0.min_j0rjbv$(that);
  };
  Sievert.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_ip0tw7$_0.minus_j0rjbv$(that);
  };
  Sievert.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_ip0tw7$_0.new_14dthe$(siValue);
  };
  Sievert.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_ip0tw7$_0.plus_j0rjbv$(that);
  };
  Sievert.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_ip0tw7$_0.rem_j0rjbv$(that);
  };
  Sievert.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_ip0tw7$_0.times_3p81yu$(that);
  };
  Sievert.prototype.unaryMinus = function () {
    return this.$delegate_ip0tw7$_0.unaryMinus();
  };
  Sievert.prototype.unaryPlus = function () {
    return this.$delegate_ip0tw7$_0.unaryPlus();
  };
  Sievert.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Sievert',
    interfaces: [Quan, UomConverter]
  };
  var Sievert_instance = null;
  function Sievert_getInstance() {
    if (Sievert_instance === null) {
      new Sievert();
    }
    return Sievert_instance;
  }
  function div_86($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_87($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_95(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function div_88($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_89($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_96(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_90($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_91($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_97(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function times_106($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_107($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_98(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_92($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function div_93($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function p_99(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue / that.siValue);
  }
  function div_94($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_95($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_100(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_108($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_109($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_101(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function L1A0M0I0Theta0N0J0_per_T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T2.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5s\u207B\xB2';
    }
  });
  L1A0M0I0Theta0N0J0_per_T2.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M0I0Theta0N0J0_per_T2(siValue);
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.unaryPlus = function () {
    return new L1A0M0I0Theta0N0J0_per_T2(+this.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.unaryMinus = function () {
    return new L1A0M0I0Theta0N0J0_per_T2(-this.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.times_3p81yu$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.div_3p81yu$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M0I0Theta0N0J0_per_T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M0I0Theta0N0J0_per_T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M0I0Theta0N0J0_per_T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M0I0Theta0N0J0_per_T2',
    interfaces: [Quan]
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M0I0Theta0N0J0_per_T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_96($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_97($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_102(thiz, op, that) {
    return new L0A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function div_98($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_99($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_103(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_110($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_111($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_104(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function times_112($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function times_113($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function p_105(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T4(thiz.siValue * that.siValue);
  }
  function div_100($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_101($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_106(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function times_114($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_115($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_107(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function times_116($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function times_117($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function p_108(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue * that.siValue);
  }
  function div_102($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_103($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_109(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function L2A0M0I0Theta0N0J0_per_T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T3.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5s\u207B\xB3';
    }
  });
  L2A0M0I0Theta0N0J0_per_T3.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M0I0Theta0N0J0_per_T3(siValue);
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.unaryPlus = function () {
    return new L2A0M0I0Theta0N0J0_per_T3(+this.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.unaryMinus = function () {
    return new L2A0M0I0Theta0N0J0_per_T3(-this.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.times_3p81yu$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.div_3p81yu$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M0I0Theta0N0J0_per_T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M0I0Theta0N0J0_per_T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M0I0Theta0N0J0_per_T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M0I0Theta0N0J0_per_T3',
    interfaces: [Quan]
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M0I0Theta0N0J0_per_T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_104($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_105($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_110(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function div_106($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_107($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_111(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_108($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_109($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_112(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function div_110($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function div_111($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function p_113(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue / that.siValue);
  }
  function times_118($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_119($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_114(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function div_112($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_113($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_115(thiz, op, that) {
    return new L0A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function div_114($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function div_115($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function p_116(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T4(thiz.siValue / that.siValue);
  }
  function times_120($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_121($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_117(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_116($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_117($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_118(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function times_122($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function times_123($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function p_119(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T4(thiz.siValue * that.siValue);
  }
  function div_118($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_119($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_120(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function L0A0M0I0Theta0N0J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 's\u207B\xB9';
    }
  });
  L0A0M0I0Theta0N0J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0I0Theta0N0J0_per_T1(siValue);
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.unaryPlus = function () {
    return new L0A0M0I0Theta0N0J0_per_T1(+this.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.unaryMinus = function () {
    return new L0A0M0I0Theta0N0J0_per_T1(-this.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0I0Theta0N0J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0I0Theta0N0J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0I0Theta0N0J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0I0Theta0N0J0_per_T1',
    interfaces: [Quan]
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0I0Theta0N0J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Hertz = defineInlineFunction('output.info.kunalsheth.units.generated.get_Hertz_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0I0Theta0N0J0_per_T1_init = _.info.kunalsheth.units.generated.L0A0M0I0Theta0N0J0_per_T1;
    return function ($receiver) {
      return new L0A0M0I0Theta0N0J0_per_T1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Hertz_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Hertz_tizgwv$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Hertz() {
    Hertz_instance = this;
    this.$delegate_v329mk$_0 = box(new L0A0M0I0Theta0N0J0_per_T1(1.0));
    this.unitName_n9081r$_0 = 'Hertz';
  }
  Object.defineProperty(Hertz.prototype, 'unitName', {
    get: function () {
      return this.unitName_n9081r$_0;
    }
  });
  Hertz.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0I0Theta0N0J0_per_T1(numberToDouble(x) * 1.0);
  };
  Hertz.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Hertz.prototype, 'abrev', {
    get: function () {
      return this.$delegate_v329mk$_0.abrev;
    }
  });
  Object.defineProperty(Hertz.prototype, 'abs', {
    get: function () {
      return this.$delegate_v329mk$_0.abs;
    }
  });
  Object.defineProperty(Hertz.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_v329mk$_0.isNegative;
    }
  });
  Object.defineProperty(Hertz.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_v329mk$_0.isPositive;
    }
  });
  Object.defineProperty(Hertz.prototype, 'isZero', {
    get: function () {
      return this.$delegate_v329mk$_0.isZero;
    }
  });
  Object.defineProperty(Hertz.prototype, 'siValue', {
    get: function () {
      return this.$delegate_v329mk$_0.siValue;
    }
  });
  Object.defineProperty(Hertz.prototype, 'signum', {
    get: function () {
      return this.$delegate_v329mk$_0.signum;
    }
  });
  Hertz.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_v329mk$_0.compareTo_11rb$(other);
  };
  Hertz.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_v329mk$_0.div_3p81yu$(that);
  };
  Hertz.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_v329mk$_0.max_j0rjbv$(that);
  };
  Hertz.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_v329mk$_0.min_j0rjbv$(that);
  };
  Hertz.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_v329mk$_0.minus_j0rjbv$(that);
  };
  Hertz.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_v329mk$_0.new_14dthe$(siValue);
  };
  Hertz.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_v329mk$_0.plus_j0rjbv$(that);
  };
  Hertz.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_v329mk$_0.rem_j0rjbv$(that);
  };
  Hertz.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_v329mk$_0.times_3p81yu$(that);
  };
  Hertz.prototype.unaryMinus = function () {
    return this.$delegate_v329mk$_0.unaryMinus();
  };
  Hertz.prototype.unaryPlus = function () {
    return this.$delegate_v329mk$_0.unaryPlus();
  };
  Hertz.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Hertz',
    interfaces: [Quan, UomConverter]
  };
  var Hertz_instance = null;
  function Hertz_getInstance() {
    if (Hertz_instance === null) {
      new Hertz();
    }
    return Hertz_instance;
  }
  var get_Becquerel = defineInlineFunction('output.info.kunalsheth.units.generated.get_Becquerel_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0I0Theta0N0J0_per_T1_init = _.info.kunalsheth.units.generated.L0A0M0I0Theta0N0J0_per_T1;
    return function ($receiver) {
      return new L0A0M0I0Theta0N0J0_per_T1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Becquerel_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Becquerel_tizgwv$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Becquerel() {
    Becquerel_instance = this;
    this.$delegate_b2ptwh$_0 = box(new L0A0M0I0Theta0N0J0_per_T1(1.0));
    this.unitName_o455ni$_0 = 'Becquerel';
  }
  Object.defineProperty(Becquerel.prototype, 'unitName', {
    get: function () {
      return this.unitName_o455ni$_0;
    }
  });
  Becquerel.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0I0Theta0N0J0_per_T1(numberToDouble(x) * 1.0);
  };
  Becquerel.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Becquerel.prototype, 'abrev', {
    get: function () {
      return this.$delegate_b2ptwh$_0.abrev;
    }
  });
  Object.defineProperty(Becquerel.prototype, 'abs', {
    get: function () {
      return this.$delegate_b2ptwh$_0.abs;
    }
  });
  Object.defineProperty(Becquerel.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_b2ptwh$_0.isNegative;
    }
  });
  Object.defineProperty(Becquerel.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_b2ptwh$_0.isPositive;
    }
  });
  Object.defineProperty(Becquerel.prototype, 'isZero', {
    get: function () {
      return this.$delegate_b2ptwh$_0.isZero;
    }
  });
  Object.defineProperty(Becquerel.prototype, 'siValue', {
    get: function () {
      return this.$delegate_b2ptwh$_0.siValue;
    }
  });
  Object.defineProperty(Becquerel.prototype, 'signum', {
    get: function () {
      return this.$delegate_b2ptwh$_0.signum;
    }
  });
  Becquerel.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_b2ptwh$_0.compareTo_11rb$(other);
  };
  Becquerel.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_b2ptwh$_0.div_3p81yu$(that);
  };
  Becquerel.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_b2ptwh$_0.max_j0rjbv$(that);
  };
  Becquerel.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_b2ptwh$_0.min_j0rjbv$(that);
  };
  Becquerel.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_b2ptwh$_0.minus_j0rjbv$(that);
  };
  Becquerel.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_b2ptwh$_0.new_14dthe$(siValue);
  };
  Becquerel.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_b2ptwh$_0.plus_j0rjbv$(that);
  };
  Becquerel.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_b2ptwh$_0.rem_j0rjbv$(that);
  };
  Becquerel.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_b2ptwh$_0.times_3p81yu$(that);
  };
  Becquerel.prototype.unaryMinus = function () {
    return this.$delegate_b2ptwh$_0.unaryMinus();
  };
  Becquerel.prototype.unaryPlus = function () {
    return this.$delegate_b2ptwh$_0.unaryPlus();
  };
  Becquerel.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Becquerel',
    interfaces: [Quan, UomConverter]
  };
  var Becquerel_instance = null;
  function Becquerel_getInstance() {
    if (Becquerel_instance === null) {
      new Becquerel();
    }
    return Becquerel_instance;
  }
  function div_120($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_121($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_121(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_124($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_125($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_122(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_122($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_123($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_123(thiz, op, that) {
    return new L0A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function times_126($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function times_127($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue * that.siValue);
  }
  function p_124(thiz, op, that) {
    return new L0A0M0I0Theta0N0J0_per_T1(thiz.siValue * that.siValue);
  }
  function times_128($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_129($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_125(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function times_130($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_131($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_126(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_132($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function times_133($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function p_127(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T4(thiz.siValue * that.siValue);
  }
  function L2A0M0I0Theta0N0J0_per_T4(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T4.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T4.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5s\u207B\u2074';
    }
  });
  L2A0M0I0Theta0N0J0_per_T4.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M0I0Theta0N0J0_per_T4(siValue);
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.unaryPlus = function () {
    return new L2A0M0I0Theta0N0J0_per_T4(+this.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.unaryMinus = function () {
    return new L2A0M0I0Theta0N0J0_per_T4(-this.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.times_3p81yu$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.div_3p81yu$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T4.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M0I0Theta0N0J0_per_T4(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T4.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T4.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T4.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T4.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M0I0Theta0N0J0_per_T4.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M0I0Theta0N0J0_per_T4.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M0I0Theta0N0J0_per_T4',
    interfaces: [Quan]
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M0I0Theta0N0J0_per_T4.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_124($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_125($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_128(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_126($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_127($receiver, that) {
    return new L1A0M0I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_129(thiz, op, that) {
    return new L1A0M0I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function div_128($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function div_129($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function p_130(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T4(thiz.siValue / that.siValue);
  }
  function times_134($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function times_135($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function p_131(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T4(thiz.siValue * that.siValue);
  }
  function times_136($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_137($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_132(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function div_130($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function div_131($receiver, that) {
    return new L0A0M0I0Theta0N0J0_per_T1($receiver.siValue / that.siValue);
  }
  function p_133(thiz, op, that) {
    return new L0A0M0I0Theta0N0J0_per_T1(thiz.siValue / that.siValue);
  }
  function div_132($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function div_133($receiver, that) {
    return new L2A0M0I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function p_134(thiz, op, that) {
    return new L2A0M0I0Theta0N0J0_per_T3(thiz.siValue / that.siValue);
  }
  function L2A0M1I0Theta0N0J0_per_T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T3.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB3';
    }
  });
  L2A0M1I0Theta0N0J0_per_T3.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1I0Theta0N0J0_per_T3(siValue);
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.unaryPlus = function () {
    return new L2A0M1I0Theta0N0J0_per_T3(+this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.unaryMinus = function () {
    return new L2A0M1I0Theta0N0J0_per_T3(-this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1I0Theta0N0J0_per_T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1I0Theta0N0J0_per_T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1I0Theta0N0J0_per_T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1I0Theta0N0J0_per_T3',
    interfaces: [Quan]
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1I0Theta0N0J0_per_T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Watt = defineInlineFunction('output.info.kunalsheth.units.generated.get_Watt_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L2A0M1I0Theta0N0J0_per_T3_init = _.info.kunalsheth.units.generated.L2A0M1I0Theta0N0J0_per_T3;
    return function ($receiver) {
      return new L2A0M1I0Theta0N0J0_per_T3_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Watt_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Watt_zchwdc$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Watt() {
    Watt_instance = this;
    this.$delegate_xdh6wx$_0 = box(new L2A0M1I0Theta0N0J0_per_T3(1.0));
    this.unitName_d7908u$_0 = 'Watt';
  }
  Object.defineProperty(Watt.prototype, 'unitName', {
    get: function () {
      return this.unitName_d7908u$_0;
    }
  });
  Watt.prototype.invoke_14dthe$ = function (x) {
    return new L2A0M1I0Theta0N0J0_per_T3(numberToDouble(x) * 1.0);
  };
  Watt.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Watt.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xdh6wx$_0.abrev;
    }
  });
  Object.defineProperty(Watt.prototype, 'abs', {
    get: function () {
      return this.$delegate_xdh6wx$_0.abs;
    }
  });
  Object.defineProperty(Watt.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xdh6wx$_0.isNegative;
    }
  });
  Object.defineProperty(Watt.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xdh6wx$_0.isPositive;
    }
  });
  Object.defineProperty(Watt.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xdh6wx$_0.isZero;
    }
  });
  Object.defineProperty(Watt.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xdh6wx$_0.siValue;
    }
  });
  Object.defineProperty(Watt.prototype, 'signum', {
    get: function () {
      return this.$delegate_xdh6wx$_0.signum;
    }
  });
  Watt.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xdh6wx$_0.compareTo_11rb$(other);
  };
  Watt.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xdh6wx$_0.div_3p81yu$(that);
  };
  Watt.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xdh6wx$_0.max_j0rjbv$(that);
  };
  Watt.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xdh6wx$_0.min_j0rjbv$(that);
  };
  Watt.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xdh6wx$_0.minus_j0rjbv$(that);
  };
  Watt.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xdh6wx$_0.new_14dthe$(siValue);
  };
  Watt.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xdh6wx$_0.plus_j0rjbv$(that);
  };
  Watt.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xdh6wx$_0.rem_j0rjbv$(that);
  };
  Watt.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xdh6wx$_0.times_3p81yu$(that);
  };
  Watt.prototype.unaryMinus = function () {
    return this.$delegate_xdh6wx$_0.unaryMinus();
  };
  Watt.prototype.unaryPlus = function () {
    return this.$delegate_xdh6wx$_0.unaryPlus();
  };
  Watt.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Watt',
    interfaces: [Quan, UomConverter]
  };
  var Watt_instance = null;
  function Watt_getInstance() {
    if (Watt_instance === null) {
      new Watt();
    }
    return Watt_instance;
  }
  function div_134($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_135($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_135(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_138($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function times_139($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function p_136(thiz, op, that) {
    return new L4A0M2I0Theta0N0J0_per_T6(thiz.siValue * that.siValue);
  }
  function div_136($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function div_137($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function p_137(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T4(thiz.siValue / that.siValue);
  }
  function times_140($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_141($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_138(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_138($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function div_139($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function p_139(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T3(thiz.siValue / that.siValue);
  }
  function times_142($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_143($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_140(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function div_140($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_141($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_141(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_144($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_145($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_142(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function L4A0M2I0Theta0N0J0_per_T6(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L4A0M2I0Theta0N0J0_per_T6.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L4A0M2I0Theta0N0J0_per_T6.prototype, 'abrev', {
    get: function () {
      return 'm\u2074\u22C5kg\xB2\u22C5s\u207B\u2076';
    }
  });
  L4A0M2I0Theta0N0J0_per_T6.prototype.new_14dthe$ = function (siValue) {
    return new L4A0M2I0Theta0N0J0_per_T6(siValue);
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.unaryPlus = function () {
    return new L4A0M2I0Theta0N0J0_per_T6(+this.underlying_8be2vx$);
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.unaryMinus = function () {
    return new L4A0M2I0Theta0N0J0_per_T6(-this.underlying_8be2vx$);
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.plus_j0rjbv$ = function (that) {
    return new L4A0M2I0Theta0N0J0_per_T6(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.minus_j0rjbv$ = function (that) {
    return new L4A0M2I0Theta0N0J0_per_T6(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.times_3p81yu$ = function (that) {
    return new L4A0M2I0Theta0N0J0_per_T6(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.div_3p81yu$ = function (that) {
    return new L4A0M2I0Theta0N0J0_per_T6(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.rem_j0rjbv$ = function (that) {
    return new L4A0M2I0Theta0N0J0_per_T6(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L4A0M2I0Theta0N0J0_per_T6.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L4A0M2I0Theta0N0J0_per_T6(Math_0.abs(x));
    }
  });
  Object.defineProperty(L4A0M2I0Theta0N0J0_per_T6.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L4A0M2I0Theta0N0J0_per_T6.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L4A0M2I0Theta0N0J0_per_T6.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L4A0M2I0Theta0N0J0_per_T6.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L4A0M2I0Theta0N0J0_per_T6.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L4A0M2I0Theta0N0J0_per_T6.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L4A0M2I0Theta0N0J0_per_T6',
    interfaces: [Quan]
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L4A0M2I0Theta0N0J0_per_T6.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_142($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function div_143($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function p_143(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T3(thiz.siValue / that.siValue);
  }
  function div_144($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_145($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_144(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_146($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue / that.siValue);
  }
  function div_147($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue / that.siValue);
  }
  function p_145(thiz, op, that) {
    return new L4A0M2I0Theta0N0J0_per_T6(thiz.siValue / that.siValue);
  }
  function times_146($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function times_147($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function p_146(thiz, op, that) {
    return new L4A0M2I0Theta0N0J0_per_T6(thiz.siValue * that.siValue);
  }
  function div_148($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_149($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_147(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function div_150($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function div_151($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function p_148(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T4(thiz.siValue / that.siValue);
  }
  function times_148($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_149($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_149(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function L2A0M1I0Theta0N0J0_per_T4(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T4.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T4.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\u2074';
    }
  });
  L2A0M1I0Theta0N0J0_per_T4.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1I0Theta0N0J0_per_T4(siValue);
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.unaryPlus = function () {
    return new L2A0M1I0Theta0N0J0_per_T4(+this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.unaryMinus = function () {
    return new L2A0M1I0Theta0N0J0_per_T4(-this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T4(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T4(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T4(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T4(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T4(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T4.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1I0Theta0N0J0_per_T4(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T4.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T4.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T4.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T4.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1I0Theta0N0J0_per_T4.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1I0Theta0N0J0_per_T4.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1I0Theta0N0J0_per_T4',
    interfaces: [Quan]
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1I0Theta0N0J0_per_T4.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_152($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_153($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_150(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_150($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function times_151($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue * that.siValue);
  }
  function p_151(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T3(thiz.siValue * that.siValue);
  }
  function div_154($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function div_155($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function p_152(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T4(thiz.siValue / that.siValue);
  }
  function times_152($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function times_153($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue * that.siValue);
  }
  function p_153(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T4(thiz.siValue * that.siValue);
  }
  function times_154($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function times_155($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function p_154(thiz, op, that) {
    return new L4A0M2I0Theta0N0J0_per_T6(thiz.siValue * that.siValue);
  }
  function times_156($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_157($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_155(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_158($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_159($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_156(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function L2A0M1I0Theta0N0J0_per_T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T2.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB2';
    }
  });
  L2A0M1I0Theta0N0J0_per_T2.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1I0Theta0N0J0_per_T2(siValue);
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.unaryPlus = function () {
    return new L2A0M1I0Theta0N0J0_per_T2(+this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.unaryMinus = function () {
    return new L2A0M1I0Theta0N0J0_per_T2(-this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1I0Theta0N0J0_per_T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1I0Theta0N0J0_per_T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1I0Theta0N0J0_per_T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1I0Theta0N0J0_per_T2',
    interfaces: [Quan]
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1I0Theta0N0J0_per_T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Joule = defineInlineFunction('output.info.kunalsheth.units.generated.get_Joule_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L2A0M1I0Theta0N0J0_per_T2_init = _.info.kunalsheth.units.generated.L2A0M1I0Theta0N0J0_per_T2;
    return function ($receiver) {
      return new L2A0M1I0Theta0N0J0_per_T2_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Joule_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Joule_zchwch$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Joule() {
    Joule_instance = this;
    this.$delegate_v1s8jy$_0 = box(new L2A0M1I0Theta0N0J0_per_T2(1.0));
    this.unitName_wslrgx$_0 = 'Joule';
  }
  Object.defineProperty(Joule.prototype, 'unitName', {
    get: function () {
      return this.unitName_wslrgx$_0;
    }
  });
  Joule.prototype.invoke_14dthe$ = function (x) {
    return new L2A0M1I0Theta0N0J0_per_T2(numberToDouble(x) * 1.0);
  };
  Joule.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Joule.prototype, 'abrev', {
    get: function () {
      return this.$delegate_v1s8jy$_0.abrev;
    }
  });
  Object.defineProperty(Joule.prototype, 'abs', {
    get: function () {
      return this.$delegate_v1s8jy$_0.abs;
    }
  });
  Object.defineProperty(Joule.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_v1s8jy$_0.isNegative;
    }
  });
  Object.defineProperty(Joule.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_v1s8jy$_0.isPositive;
    }
  });
  Object.defineProperty(Joule.prototype, 'isZero', {
    get: function () {
      return this.$delegate_v1s8jy$_0.isZero;
    }
  });
  Object.defineProperty(Joule.prototype, 'siValue', {
    get: function () {
      return this.$delegate_v1s8jy$_0.siValue;
    }
  });
  Object.defineProperty(Joule.prototype, 'signum', {
    get: function () {
      return this.$delegate_v1s8jy$_0.signum;
    }
  });
  Joule.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_v1s8jy$_0.compareTo_11rb$(other);
  };
  Joule.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_v1s8jy$_0.div_3p81yu$(that);
  };
  Joule.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_v1s8jy$_0.max_j0rjbv$(that);
  };
  Joule.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_v1s8jy$_0.min_j0rjbv$(that);
  };
  Joule.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_v1s8jy$_0.minus_j0rjbv$(that);
  };
  Joule.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_v1s8jy$_0.new_14dthe$(siValue);
  };
  Joule.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_v1s8jy$_0.plus_j0rjbv$(that);
  };
  Joule.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_v1s8jy$_0.rem_j0rjbv$(that);
  };
  Joule.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_v1s8jy$_0.times_3p81yu$(that);
  };
  Joule.prototype.unaryMinus = function () {
    return this.$delegate_v1s8jy$_0.unaryMinus();
  };
  Joule.prototype.unaryPlus = function () {
    return this.$delegate_v1s8jy$_0.unaryPlus();
  };
  Joule.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Joule',
    interfaces: [Quan, UomConverter]
  };
  var Joule_instance = null;
  function Joule_getInstance() {
    if (Joule_instance === null) {
      new Joule();
    }
    return Joule_instance;
  }
  function div_156($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_157($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_157(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_158($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_159($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_158(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function div_160($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function div_161($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T3($receiver.siValue / that.siValue);
  }
  function p_159(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T3(thiz.siValue / that.siValue);
  }
  function div_162($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function div_163($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue / that.siValue);
  }
  function p_160(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue / that.siValue);
  }
  function times_160($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_161($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_161(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function div_164($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function div_165($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function p_162(thiz, op, that) {
    return new A0T4I0Theta0N0J0_per_L2M1(thiz.siValue / that.siValue);
  }
  function div_166($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_167($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_163(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_162($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function times_163($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue * that.siValue);
  }
  function p_164(thiz, op, that) {
    return new L4A0M2I0Theta0N0J0_per_T6(thiz.siValue * that.siValue);
  }
  function div_168($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue / that.siValue);
  }
  function div_169($receiver, that) {
    return new L4A0M2I0Theta0N0J0_per_T6($receiver.siValue / that.siValue);
  }
  function p_165(thiz, op, that) {
    return new L4A0M2I0Theta0N0J0_per_T6(thiz.siValue / that.siValue);
  }
  function times_164($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_165($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_166(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_170($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function div_171($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T4($receiver.siValue / that.siValue);
  }
  function p_167(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T4(thiz.siValue / that.siValue);
  }
  function A0T4I0Theta0N0J0_per_L2M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T4I0Theta0N0J0_per_L2M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T4I0Theta0N0J0_per_L2M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5kg\u207B\xB9\u22C5s\u2074';
    }
  });
  A0T4I0Theta0N0J0_per_L2M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T4I0Theta0N0J0_per_L2M1(siValue);
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.unaryPlus = function () {
    return new A0T4I0Theta0N0J0_per_L2M1(+this.underlying_8be2vx$);
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.unaryMinus = function () {
    return new A0T4I0Theta0N0J0_per_L2M1(-this.underlying_8be2vx$);
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T4I0Theta0N0J0_per_L2M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T4I0Theta0N0J0_per_L2M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.times_3p81yu$ = function (that) {
    return new A0T4I0Theta0N0J0_per_L2M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.div_3p81yu$ = function (that) {
    return new A0T4I0Theta0N0J0_per_L2M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T4I0Theta0N0J0_per_L2M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T4I0Theta0N0J0_per_L2M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T4I0Theta0N0J0_per_L2M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T4I0Theta0N0J0_per_L2M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T4I0Theta0N0J0_per_L2M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T4I0Theta0N0J0_per_L2M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T4I0Theta0N0J0_per_L2M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T4I0Theta0N0J0_per_L2M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T4I0Theta0N0J0_per_L2M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T4I0Theta0N0J0_per_L2M1',
    interfaces: [Quan]
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T4I0Theta0N0J0_per_L2M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function div_172($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function div_173($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue / that.siValue);
  }
  function p_168(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue / that.siValue);
  }
  function times_166($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_167($receiver, that) {
    return new L0A0M0T1I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_169(thiz, op, that) {
    return new L0A0M0T1I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function div_174($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function div_175($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue / that.siValue);
  }
  function p_170(thiz, op, that) {
    return new A0T4I0Theta0N0J0_per_L2M1(thiz.siValue / that.siValue);
  }
  function times_168($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue * that.siValue);
  }
  function times_169($receiver, that) {
    return new A0T4I0Theta0N0J0_per_L2M1($receiver.siValue * that.siValue);
  }
  function p_171(thiz, op, that) {
    return new A0T4I0Theta0N0J0_per_L2M1(thiz.siValue * that.siValue);
  }
  function times_170($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function times_171($receiver, that) {
    return new L2A0M1I0Theta0N0J0_per_T2($receiver.siValue * that.siValue);
  }
  function p_172(thiz, op, that) {
    return new L2A0M1I0Theta0N0J0_per_T2(thiz.siValue * that.siValue);
  }
  function times_172($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_173($receiver, that) {
    return new L0A0M0T0I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_173(thiz, op, that) {
    return new L0A0M0T0I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function times_174($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function times_175($receiver, that) {
    return new L0A0M0T2I0Theta0N0J0($receiver.siValue * that.siValue);
  }
  function p_174(thiz, op, that) {
    return new L0A0M0T2I0Theta0N0J0(thiz.siValue * that.siValue);
  }
  function L0A0M1T0I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M1T0I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'kg';
    }
  });
  L0A0M1T0I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M1T0I0Theta0N0J0(siValue);
  };
  L0A0M1T0I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A0M1T0I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A0M1T0I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M1T0I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M1T0I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M1T0I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M1T0I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M1T0I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M1T0I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M1T0I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M1T0I0Theta0N0J0',
    interfaces: [Quan]
  };
  L0A0M1T0I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M1T0I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M1T0I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Kilogram = defineInlineFunction('output.info.kunalsheth.units.generated.get_Kilogram_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M1T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M1T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M1T0I0Theta0N0J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Kilogram_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Kilogram_nol3bw$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Kilogram() {
    Kilogram_instance = this;
    this.$delegate_pkyv9t$_0 = box(new L0A0M1T0I0Theta0N0J0(1.0));
    this.unitName_vdpfys$_0 = 'Kilogram';
  }
  Object.defineProperty(Kilogram.prototype, 'unitName', {
    get: function () {
      return this.unitName_vdpfys$_0;
    }
  });
  Kilogram.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M1T0I0Theta0N0J0(numberToDouble(x) * 1.0);
  };
  Kilogram.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Kilogram.prototype, 'abrev', {
    get: function () {
      return this.$delegate_pkyv9t$_0.abrev;
    }
  });
  Object.defineProperty(Kilogram.prototype, 'abs', {
    get: function () {
      return this.$delegate_pkyv9t$_0.abs;
    }
  });
  Object.defineProperty(Kilogram.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_pkyv9t$_0.isNegative;
    }
  });
  Object.defineProperty(Kilogram.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_pkyv9t$_0.isPositive;
    }
  });
  Object.defineProperty(Kilogram.prototype, 'isZero', {
    get: function () {
      return this.$delegate_pkyv9t$_0.isZero;
    }
  });
  Object.defineProperty(Kilogram.prototype, 'siValue', {
    get: function () {
      return this.$delegate_pkyv9t$_0.siValue;
    }
  });
  Object.defineProperty(Kilogram.prototype, 'signum', {
    get: function () {
      return this.$delegate_pkyv9t$_0.signum;
    }
  });
  Kilogram.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_pkyv9t$_0.compareTo_11rb$(other);
  };
  Kilogram.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_pkyv9t$_0.div_3p81yu$(that);
  };
  Kilogram.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_pkyv9t$_0.max_j0rjbv$(that);
  };
  Kilogram.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_pkyv9t$_0.min_j0rjbv$(that);
  };
  Kilogram.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_pkyv9t$_0.minus_j0rjbv$(that);
  };
  Kilogram.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_pkyv9t$_0.new_14dthe$(siValue);
  };
  Kilogram.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_pkyv9t$_0.plus_j0rjbv$(that);
  };
  Kilogram.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_pkyv9t$_0.rem_j0rjbv$(that);
  };
  Kilogram.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_pkyv9t$_0.times_3p81yu$(that);
  };
  Kilogram.prototype.unaryMinus = function () {
    return this.$delegate_pkyv9t$_0.unaryMinus();
  };
  Kilogram.prototype.unaryPlus = function () {
    return this.$delegate_pkyv9t$_0.unaryPlus();
  };
  Kilogram.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Kilogram',
    interfaces: [Quan, UomConverter]
  };
  var Kilogram_instance = null;
  function Kilogram_getInstance() {
    if (Kilogram_instance === null) {
      new Kilogram();
    }
    return Kilogram_instance;
  }
  var get_Ounce = defineInlineFunction('output.info.kunalsheth.units.generated.get_Ounce_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M1T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M1T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M1T0I0Theta0N0J0_init(numberToDouble($receiver) * 0.0283495);
    };
  }));
  var get_Ounce_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Ounce_nol3bw$', function ($receiver) {
    return $receiver.siValue * 35.27399072294044;
  });
  function Ounce() {
    Ounce_instance = this;
    this.$delegate_uyxl2l$_0 = box(new L0A0M1T0I0Theta0N0J0(0.0283495));
    this.unitName_eksfu8$_0 = 'Ounce';
  }
  Object.defineProperty(Ounce.prototype, 'unitName', {
    get: function () {
      return this.unitName_eksfu8$_0;
    }
  });
  Ounce.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M1T0I0Theta0N0J0(numberToDouble(x) * 0.0283495);
  };
  Ounce.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 35.27399072294044;
  };
  Object.defineProperty(Ounce.prototype, 'abrev', {
    get: function () {
      return this.$delegate_uyxl2l$_0.abrev;
    }
  });
  Object.defineProperty(Ounce.prototype, 'abs', {
    get: function () {
      return this.$delegate_uyxl2l$_0.abs;
    }
  });
  Object.defineProperty(Ounce.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_uyxl2l$_0.isNegative;
    }
  });
  Object.defineProperty(Ounce.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_uyxl2l$_0.isPositive;
    }
  });
  Object.defineProperty(Ounce.prototype, 'isZero', {
    get: function () {
      return this.$delegate_uyxl2l$_0.isZero;
    }
  });
  Object.defineProperty(Ounce.prototype, 'siValue', {
    get: function () {
      return this.$delegate_uyxl2l$_0.siValue;
    }
  });
  Object.defineProperty(Ounce.prototype, 'signum', {
    get: function () {
      return this.$delegate_uyxl2l$_0.signum;
    }
  });
  Ounce.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_uyxl2l$_0.compareTo_11rb$(other);
  };
  Ounce.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_uyxl2l$_0.div_3p81yu$(that);
  };
  Ounce.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_uyxl2l$_0.max_j0rjbv$(that);
  };
  Ounce.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_uyxl2l$_0.min_j0rjbv$(that);
  };
  Ounce.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_uyxl2l$_0.minus_j0rjbv$(that);
  };
  Ounce.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_uyxl2l$_0.new_14dthe$(siValue);
  };
  Ounce.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_uyxl2l$_0.plus_j0rjbv$(that);
  };
  Ounce.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_uyxl2l$_0.rem_j0rjbv$(that);
  };
  Ounce.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_uyxl2l$_0.times_3p81yu$(that);
  };
  Ounce.prototype.unaryMinus = function () {
    return this.$delegate_uyxl2l$_0.unaryMinus();
  };
  Ounce.prototype.unaryPlus = function () {
    return this.$delegate_uyxl2l$_0.unaryPlus();
  };
  Ounce.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Ounce',
    interfaces: [Quan, UomConverter]
  };
  var Ounce_instance = null;
  function Ounce_getInstance() {
    if (Ounce_instance === null) {
      new Ounce();
    }
    return Ounce_instance;
  }
  var get_Gram = defineInlineFunction('output.info.kunalsheth.units.generated.get_Gram_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M1T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M1T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M1T0I0Theta0N0J0_init(numberToDouble($receiver) * 0.001);
    };
  }));
  var get_Gram_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Gram_nol3bw$', function ($receiver) {
    return $receiver.siValue * 1000.0;
  });
  function Gram() {
    Gram_instance = this;
    this.$delegate_xd7b9q$_0 = box(new L0A0M1T0I0Theta0N0J0(0.001));
    this.unitName_iv13nv$_0 = 'Gram';
  }
  Object.defineProperty(Gram.prototype, 'unitName', {
    get: function () {
      return this.unitName_iv13nv$_0;
    }
  });
  Gram.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M1T0I0Theta0N0J0(numberToDouble(x) * 0.001);
  };
  Gram.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1000.0;
  };
  Object.defineProperty(Gram.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xd7b9q$_0.abrev;
    }
  });
  Object.defineProperty(Gram.prototype, 'abs', {
    get: function () {
      return this.$delegate_xd7b9q$_0.abs;
    }
  });
  Object.defineProperty(Gram.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xd7b9q$_0.isNegative;
    }
  });
  Object.defineProperty(Gram.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xd7b9q$_0.isPositive;
    }
  });
  Object.defineProperty(Gram.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xd7b9q$_0.isZero;
    }
  });
  Object.defineProperty(Gram.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xd7b9q$_0.siValue;
    }
  });
  Object.defineProperty(Gram.prototype, 'signum', {
    get: function () {
      return this.$delegate_xd7b9q$_0.signum;
    }
  });
  Gram.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xd7b9q$_0.compareTo_11rb$(other);
  };
  Gram.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xd7b9q$_0.div_3p81yu$(that);
  };
  Gram.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xd7b9q$_0.max_j0rjbv$(that);
  };
  Gram.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xd7b9q$_0.min_j0rjbv$(that);
  };
  Gram.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xd7b9q$_0.minus_j0rjbv$(that);
  };
  Gram.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xd7b9q$_0.new_14dthe$(siValue);
  };
  Gram.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xd7b9q$_0.plus_j0rjbv$(that);
  };
  Gram.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xd7b9q$_0.rem_j0rjbv$(that);
  };
  Gram.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xd7b9q$_0.times_3p81yu$(that);
  };
  Gram.prototype.unaryMinus = function () {
    return this.$delegate_xd7b9q$_0.unaryMinus();
  };
  Gram.prototype.unaryPlus = function () {
    return this.$delegate_xd7b9q$_0.unaryPlus();
  };
  Gram.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Gram',
    interfaces: [Quan, UomConverter]
  };
  var Gram_instance = null;
  function Gram_getInstance() {
    if (Gram_instance === null) {
      new Gram();
    }
    return Gram_instance;
  }
  var get_Pound = defineInlineFunction('output.info.kunalsheth.units.generated.get_Pound_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M1T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M1T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A0M1T0I0Theta0N0J0_init(numberToDouble($receiver) * 0.453592);
    };
  }));
  var get_Pound_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Pound_nol3bw$', function ($receiver) {
    return $receiver.siValue * 2.2046244201837775;
  });
  function Pound() {
    Pound_instance = this;
    this.$delegate_uyhgy3$_0 = box(new L0A0M1T0I0Theta0N0J0(0.453592));
    this.unitName_8q2tde$_0 = 'Pound';
  }
  Object.defineProperty(Pound.prototype, 'unitName', {
    get: function () {
      return this.unitName_8q2tde$_0;
    }
  });
  Pound.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M1T0I0Theta0N0J0(numberToDouble(x) * 0.453592);
  };
  Pound.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 2.2046244201837775;
  };
  Object.defineProperty(Pound.prototype, 'abrev', {
    get: function () {
      return this.$delegate_uyhgy3$_0.abrev;
    }
  });
  Object.defineProperty(Pound.prototype, 'abs', {
    get: function () {
      return this.$delegate_uyhgy3$_0.abs;
    }
  });
  Object.defineProperty(Pound.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_uyhgy3$_0.isNegative;
    }
  });
  Object.defineProperty(Pound.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_uyhgy3$_0.isPositive;
    }
  });
  Object.defineProperty(Pound.prototype, 'isZero', {
    get: function () {
      return this.$delegate_uyhgy3$_0.isZero;
    }
  });
  Object.defineProperty(Pound.prototype, 'siValue', {
    get: function () {
      return this.$delegate_uyhgy3$_0.siValue;
    }
  });
  Object.defineProperty(Pound.prototype, 'signum', {
    get: function () {
      return this.$delegate_uyhgy3$_0.signum;
    }
  });
  Pound.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_uyhgy3$_0.compareTo_11rb$(other);
  };
  Pound.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_uyhgy3$_0.div_3p81yu$(that);
  };
  Pound.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_uyhgy3$_0.max_j0rjbv$(that);
  };
  Pound.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_uyhgy3$_0.min_j0rjbv$(that);
  };
  Pound.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_uyhgy3$_0.minus_j0rjbv$(that);
  };
  Pound.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_uyhgy3$_0.new_14dthe$(siValue);
  };
  Pound.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_uyhgy3$_0.plus_j0rjbv$(that);
  };
  Pound.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_uyhgy3$_0.rem_j0rjbv$(that);
  };
  Pound.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_uyhgy3$_0.times_3p81yu$(that);
  };
  Pound.prototype.unaryMinus = function () {
    return this.$delegate_uyhgy3$_0.unaryMinus();
  };
  Pound.prototype.unaryPlus = function () {
    return this.$delegate_uyhgy3$_0.unaryPlus();
  };
  Pound.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Pound',
    interfaces: [Quan, UomConverter]
  };
  var Pound_instance = null;
  function Pound_getInstance() {
    if (Pound_instance === null) {
      new Pound();
    }
    return Pound_instance;
  }
  function L0A0M0T0I1Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T0I1Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T0I1Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'A';
    }
  });
  L0A0M0T0I1Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T0I1Theta0N0J0(siValue);
  };
  L0A0M0T0I1Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A0M0T0I1Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A0M0T0I1Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A0M0T0I1Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A0M0T0I1Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T0I1Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T0I1Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T0I1Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T0I1Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T0I1Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T0I1Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T0I1Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T0I1Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T0I1Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T0I1Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T0I1Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T0I1Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T0I1Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T0I1Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T0I1Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T0I1Theta0N0J0',
    interfaces: [Quan]
  };
  L0A0M0T0I1Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T0I1Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T0I1Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Ampere = defineInlineFunction('output.info.kunalsheth.units.generated.get_Ampere_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T0I1Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T0I1Theta0N0J0;
    return function ($receiver) {
      return new L0A0M0T0I1Theta0N0J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Ampere_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Ampere_d3rvrw$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Ampere() {
    Ampere_instance = this;
    this.$delegate_rlnw0b$_0 = box(new L0A0M0T0I1Theta0N0J0(1.0));
    this.unitName_djo96g$_0 = 'Ampere';
  }
  Object.defineProperty(Ampere.prototype, 'unitName', {
    get: function () {
      return this.unitName_djo96g$_0;
    }
  });
  Ampere.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T0I1Theta0N0J0(numberToDouble(x) * 1.0);
  };
  Ampere.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Ampere.prototype, 'abrev', {
    get: function () {
      return this.$delegate_rlnw0b$_0.abrev;
    }
  });
  Object.defineProperty(Ampere.prototype, 'abs', {
    get: function () {
      return this.$delegate_rlnw0b$_0.abs;
    }
  });
  Object.defineProperty(Ampere.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_rlnw0b$_0.isNegative;
    }
  });
  Object.defineProperty(Ampere.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_rlnw0b$_0.isPositive;
    }
  });
  Object.defineProperty(Ampere.prototype, 'isZero', {
    get: function () {
      return this.$delegate_rlnw0b$_0.isZero;
    }
  });
  Object.defineProperty(Ampere.prototype, 'siValue', {
    get: function () {
      return this.$delegate_rlnw0b$_0.siValue;
    }
  });
  Object.defineProperty(Ampere.prototype, 'signum', {
    get: function () {
      return this.$delegate_rlnw0b$_0.signum;
    }
  });
  Ampere.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_rlnw0b$_0.compareTo_11rb$(other);
  };
  Ampere.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_rlnw0b$_0.div_3p81yu$(that);
  };
  Ampere.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_rlnw0b$_0.max_j0rjbv$(that);
  };
  Ampere.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_rlnw0b$_0.min_j0rjbv$(that);
  };
  Ampere.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_rlnw0b$_0.minus_j0rjbv$(that);
  };
  Ampere.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_rlnw0b$_0.new_14dthe$(siValue);
  };
  Ampere.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_rlnw0b$_0.plus_j0rjbv$(that);
  };
  Ampere.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_rlnw0b$_0.rem_j0rjbv$(that);
  };
  Ampere.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_rlnw0b$_0.times_3p81yu$(that);
  };
  Ampere.prototype.unaryMinus = function () {
    return this.$delegate_rlnw0b$_0.unaryMinus();
  };
  Ampere.prototype.unaryPlus = function () {
    return this.$delegate_rlnw0b$_0.unaryPlus();
  };
  Ampere.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Ampere',
    interfaces: [Quan, UomConverter]
  };
  var Ampere_instance = null;
  function Ampere_getInstance() {
    if (Ampere_instance === null) {
      new Ampere();
    }
    return Ampere_instance;
  }
  function L0A0M0T0I0Theta1N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T0I0Theta1N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta1N0J0.prototype, 'abrev', {
    get: function () {
      return 'K';
    }
  });
  L0A0M0T0I0Theta1N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T0I0Theta1N0J0(siValue);
  };
  L0A0M0T0I0Theta1N0J0.prototype.unaryPlus = function () {
    return new L0A0M0T0I0Theta1N0J0(+this.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta1N0J0.prototype.unaryMinus = function () {
    return new L0A0M0T0I0Theta1N0J0(-this.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta1N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta1N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta1N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta1N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta1N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T0I0Theta1N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T0I0Theta1N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T0I0Theta1N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T0I0Theta1N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta1N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta1N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T0I0Theta1N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T0I0Theta1N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T0I0Theta1N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta1N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta1N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta1N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta1N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T0I0Theta1N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta1N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T0I0Theta1N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T0I0Theta1N0J0',
    interfaces: [Quan]
  };
  L0A0M0T0I0Theta1N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T0I0Theta1N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T0I0Theta1N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Kelvin = defineInlineFunction('output.info.kunalsheth.units.generated.get_Kelvin_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T0I0Theta1N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T0I0Theta1N0J0;
    return function ($receiver) {
      return new L0A0M0T0I0Theta1N0J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Kelvin_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Kelvin_erky8s$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Kelvin() {
    Kelvin_instance = this;
    this.$delegate_w7njnk$_0 = box(new L0A0M0T0I0Theta1N0J0(1.0));
    this.unitName_648p8d$_0 = 'Kelvin';
  }
  Object.defineProperty(Kelvin.prototype, 'unitName', {
    get: function () {
      return this.unitName_648p8d$_0;
    }
  });
  Kelvin.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T0I0Theta1N0J0(numberToDouble(x) * 1.0);
  };
  Kelvin.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Kelvin.prototype, 'abrev', {
    get: function () {
      return this.$delegate_w7njnk$_0.abrev;
    }
  });
  Object.defineProperty(Kelvin.prototype, 'abs', {
    get: function () {
      return this.$delegate_w7njnk$_0.abs;
    }
  });
  Object.defineProperty(Kelvin.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_w7njnk$_0.isNegative;
    }
  });
  Object.defineProperty(Kelvin.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_w7njnk$_0.isPositive;
    }
  });
  Object.defineProperty(Kelvin.prototype, 'isZero', {
    get: function () {
      return this.$delegate_w7njnk$_0.isZero;
    }
  });
  Object.defineProperty(Kelvin.prototype, 'siValue', {
    get: function () {
      return this.$delegate_w7njnk$_0.siValue;
    }
  });
  Object.defineProperty(Kelvin.prototype, 'signum', {
    get: function () {
      return this.$delegate_w7njnk$_0.signum;
    }
  });
  Kelvin.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_w7njnk$_0.compareTo_11rb$(other);
  };
  Kelvin.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_w7njnk$_0.div_3p81yu$(that);
  };
  Kelvin.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_w7njnk$_0.max_j0rjbv$(that);
  };
  Kelvin.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_w7njnk$_0.min_j0rjbv$(that);
  };
  Kelvin.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_w7njnk$_0.minus_j0rjbv$(that);
  };
  Kelvin.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_w7njnk$_0.new_14dthe$(siValue);
  };
  Kelvin.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_w7njnk$_0.plus_j0rjbv$(that);
  };
  Kelvin.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_w7njnk$_0.rem_j0rjbv$(that);
  };
  Kelvin.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_w7njnk$_0.times_3p81yu$(that);
  };
  Kelvin.prototype.unaryMinus = function () {
    return this.$delegate_w7njnk$_0.unaryMinus();
  };
  Kelvin.prototype.unaryPlus = function () {
    return this.$delegate_w7njnk$_0.unaryPlus();
  };
  Kelvin.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Kelvin',
    interfaces: [Quan, UomConverter]
  };
  var Kelvin_instance = null;
  function Kelvin_getInstance() {
    if (Kelvin_instance === null) {
      new Kelvin();
    }
    return Kelvin_instance;
  }
  function L0A0M0T0I0Theta0N1J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T0I0Theta0N1J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N1J0.prototype, 'abrev', {
    get: function () {
      return 'mol';
    }
  });
  L0A0M0T0I0Theta0N1J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T0I0Theta0N1J0(siValue);
  };
  L0A0M0T0I0Theta0N1J0.prototype.unaryPlus = function () {
    return new L0A0M0T0I0Theta0N1J0(+this.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N1J0.prototype.unaryMinus = function () {
    return new L0A0M0T0I0Theta0N1J0(-this.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N1J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N1J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N1J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N1J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N1J0.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T0I0Theta0N1J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T0I0Theta0N1J0.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T0I0Theta0N1J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T0I0Theta0N1J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N1J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N1J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T0I0Theta0N1J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T0I0Theta0N1J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T0I0Theta0N1J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N1J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N1J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N1J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N1J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T0I0Theta0N1J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N1J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T0I0Theta0N1J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T0I0Theta0N1J0',
    interfaces: [Quan]
  };
  L0A0M0T0I0Theta0N1J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T0I0Theta0N1J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T0I0Theta0N1J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Mole = defineInlineFunction('output.info.kunalsheth.units.generated.get_Mole_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T0I0Theta0N1J0_init = _.info.kunalsheth.units.generated.L0A0M0T0I0Theta0N1J0;
    return function ($receiver) {
      return new L0A0M0T0I0Theta0N1J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Mole_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Mole_f8lxng$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Mole() {
    Mole_instance = this;
    this.$delegate_xdb382$_0 = box(new L0A0M0T0I0Theta0N1J0(1.0));
    this.unitName_ve0g0f$_0 = 'Mole';
  }
  Object.defineProperty(Mole.prototype, 'unitName', {
    get: function () {
      return this.unitName_ve0g0f$_0;
    }
  });
  Mole.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T0I0Theta0N1J0(numberToDouble(x) * 1.0);
  };
  Mole.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Mole.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xdb382$_0.abrev;
    }
  });
  Object.defineProperty(Mole.prototype, 'abs', {
    get: function () {
      return this.$delegate_xdb382$_0.abs;
    }
  });
  Object.defineProperty(Mole.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xdb382$_0.isNegative;
    }
  });
  Object.defineProperty(Mole.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xdb382$_0.isPositive;
    }
  });
  Object.defineProperty(Mole.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xdb382$_0.isZero;
    }
  });
  Object.defineProperty(Mole.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xdb382$_0.siValue;
    }
  });
  Object.defineProperty(Mole.prototype, 'signum', {
    get: function () {
      return this.$delegate_xdb382$_0.signum;
    }
  });
  Mole.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xdb382$_0.compareTo_11rb$(other);
  };
  Mole.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xdb382$_0.div_3p81yu$(that);
  };
  Mole.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xdb382$_0.max_j0rjbv$(that);
  };
  Mole.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xdb382$_0.min_j0rjbv$(that);
  };
  Mole.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xdb382$_0.minus_j0rjbv$(that);
  };
  Mole.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xdb382$_0.new_14dthe$(siValue);
  };
  Mole.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xdb382$_0.plus_j0rjbv$(that);
  };
  Mole.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xdb382$_0.rem_j0rjbv$(that);
  };
  Mole.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xdb382$_0.times_3p81yu$(that);
  };
  Mole.prototype.unaryMinus = function () {
    return this.$delegate_xdb382$_0.unaryMinus();
  };
  Mole.prototype.unaryPlus = function () {
    return this.$delegate_xdb382$_0.unaryPlus();
  };
  Mole.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Mole',
    interfaces: [Quan, UomConverter]
  };
  var Mole_instance = null;
  function Mole_getInstance() {
    if (Mole_instance === null) {
      new Mole();
    }
    return Mole_instance;
  }
  function L0A0M0T0I0Theta0N0J1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T0I0Theta0N0J1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J1.prototype, 'abrev', {
    get: function () {
      return 'cd';
    }
  });
  L0A0M0T0I0Theta0N0J1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T0I0Theta0N0J1(siValue);
  };
  L0A0M0T0I0Theta0N0J1.prototype.unaryPlus = function () {
    return new L0A0M0T0I0Theta0N0J1(+this.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J1.prototype.unaryMinus = function () {
    return new L0A0M0T0I0Theta0N0J1(-this.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N0J1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N0J1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J1.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T0I0Theta0N0J1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T0I0Theta0N0J1.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T0I0Theta0N0J1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T0I0Theta0N0J1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T0I0Theta0N0J1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T0I0Theta0N0J1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T0I0Theta0N0J1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T0I0Theta0N0J1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T0I0Theta0N0J1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T0I0Theta0N0J1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T0I0Theta0N0J1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T0I0Theta0N0J1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T0I0Theta0N0J1',
    interfaces: [Quan]
  };
  L0A0M0T0I0Theta0N0J1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T0I0Theta0N0J1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T0I0Theta0N0J1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Candela = defineInlineFunction('output.info.kunalsheth.units.generated.get_Candela_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T0I0Theta0N0J1_init = _.info.kunalsheth.units.generated.L0A0M0T0I0Theta0N0J1;
    return function ($receiver) {
      return new L0A0M0T0I0Theta0N0J1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Candela_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Candela_f8mkm4$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Candela() {
    Candela_instance = this;
    this.$delegate_qxcipb$_0 = box(new L0A0M0T0I0Theta0N0J1(1.0));
    this.unitName_qdagt0$_0 = 'Candela';
  }
  Object.defineProperty(Candela.prototype, 'unitName', {
    get: function () {
      return this.unitName_qdagt0$_0;
    }
  });
  Candela.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T0I0Theta0N0J1(numberToDouble(x) * 1.0);
  };
  Candela.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Candela.prototype, 'abrev', {
    get: function () {
      return this.$delegate_qxcipb$_0.abrev;
    }
  });
  Object.defineProperty(Candela.prototype, 'abs', {
    get: function () {
      return this.$delegate_qxcipb$_0.abs;
    }
  });
  Object.defineProperty(Candela.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_qxcipb$_0.isNegative;
    }
  });
  Object.defineProperty(Candela.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_qxcipb$_0.isPositive;
    }
  });
  Object.defineProperty(Candela.prototype, 'isZero', {
    get: function () {
      return this.$delegate_qxcipb$_0.isZero;
    }
  });
  Object.defineProperty(Candela.prototype, 'siValue', {
    get: function () {
      return this.$delegate_qxcipb$_0.siValue;
    }
  });
  Object.defineProperty(Candela.prototype, 'signum', {
    get: function () {
      return this.$delegate_qxcipb$_0.signum;
    }
  });
  Candela.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_qxcipb$_0.compareTo_11rb$(other);
  };
  Candela.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_qxcipb$_0.div_3p81yu$(that);
  };
  Candela.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_qxcipb$_0.max_j0rjbv$(that);
  };
  Candela.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_qxcipb$_0.min_j0rjbv$(that);
  };
  Candela.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_qxcipb$_0.minus_j0rjbv$(that);
  };
  Candela.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_qxcipb$_0.new_14dthe$(siValue);
  };
  Candela.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_qxcipb$_0.plus_j0rjbv$(that);
  };
  Candela.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_qxcipb$_0.rem_j0rjbv$(that);
  };
  Candela.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_qxcipb$_0.times_3p81yu$(that);
  };
  Candela.prototype.unaryMinus = function () {
    return this.$delegate_qxcipb$_0.unaryMinus();
  };
  Candela.prototype.unaryPlus = function () {
    return this.$delegate_qxcipb$_0.unaryPlus();
  };
  Candela.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Candela',
    interfaces: [Quan, UomConverter]
  };
  var Candela_instance = null;
  function Candela_getInstance() {
    if (Candela_instance === null) {
      new Candela();
    }
    return Candela_instance;
  }
  function L0A1M0T0I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A1M0T0I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A1M0T0I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'rad';
    }
  });
  L0A1M0T0I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A1M0T0I0Theta0N0J0(siValue);
  };
  L0A1M0T0I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A1M0T0I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A1M0T0I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A1M0T0I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A1M0T0I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A1M0T0I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A1M0T0I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A1M0T0I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A1M0T0I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A1M0T0I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A1M0T0I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A1M0T0I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A1M0T0I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A1M0T0I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A1M0T0I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A1M0T0I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A1M0T0I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A1M0T0I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A1M0T0I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A1M0T0I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A1M0T0I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A1M0T0I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A1M0T0I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A1M0T0I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A1M0T0I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A1M0T0I0Theta0N0J0',
    interfaces: [Quan]
  };
  L0A1M0T0I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A1M0T0I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A1M0T0I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Radian = defineInlineFunction('output.info.kunalsheth.units.generated.get_Radian_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A1M0T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A1M0T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A1M0T0I0Theta0N0J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Radian_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Radian_vq9al8$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Radian() {
    Radian_instance = this;
    this.$delegate_zgmcbc$_0 = box(new L0A1M0T0I0Theta0N0J0(1.0));
    this.unitName_v7gpqt$_0 = 'Radian';
  }
  Object.defineProperty(Radian.prototype, 'unitName', {
    get: function () {
      return this.unitName_v7gpqt$_0;
    }
  });
  Radian.prototype.invoke_14dthe$ = function (x) {
    return new L0A1M0T0I0Theta0N0J0(numberToDouble(x) * 1.0);
  };
  Radian.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Radian.prototype, 'abrev', {
    get: function () {
      return this.$delegate_zgmcbc$_0.abrev;
    }
  });
  Object.defineProperty(Radian.prototype, 'abs', {
    get: function () {
      return this.$delegate_zgmcbc$_0.abs;
    }
  });
  Object.defineProperty(Radian.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_zgmcbc$_0.isNegative;
    }
  });
  Object.defineProperty(Radian.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_zgmcbc$_0.isPositive;
    }
  });
  Object.defineProperty(Radian.prototype, 'isZero', {
    get: function () {
      return this.$delegate_zgmcbc$_0.isZero;
    }
  });
  Object.defineProperty(Radian.prototype, 'siValue', {
    get: function () {
      return this.$delegate_zgmcbc$_0.siValue;
    }
  });
  Object.defineProperty(Radian.prototype, 'signum', {
    get: function () {
      return this.$delegate_zgmcbc$_0.signum;
    }
  });
  Radian.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_zgmcbc$_0.compareTo_11rb$(other);
  };
  Radian.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_zgmcbc$_0.div_3p81yu$(that);
  };
  Radian.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_zgmcbc$_0.max_j0rjbv$(that);
  };
  Radian.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_zgmcbc$_0.min_j0rjbv$(that);
  };
  Radian.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_zgmcbc$_0.minus_j0rjbv$(that);
  };
  Radian.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_zgmcbc$_0.new_14dthe$(siValue);
  };
  Radian.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_zgmcbc$_0.plus_j0rjbv$(that);
  };
  Radian.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_zgmcbc$_0.rem_j0rjbv$(that);
  };
  Radian.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_zgmcbc$_0.times_3p81yu$(that);
  };
  Radian.prototype.unaryMinus = function () {
    return this.$delegate_zgmcbc$_0.unaryMinus();
  };
  Radian.prototype.unaryPlus = function () {
    return this.$delegate_zgmcbc$_0.unaryPlus();
  };
  Radian.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Radian',
    interfaces: [Quan, UomConverter]
  };
  var Radian_instance = null;
  function Radian_getInstance() {
    if (Radian_instance === null) {
      new Radian();
    }
    return Radian_instance;
  }
  function L0A2M0T0I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A2M0T0I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'rad\xB2';
    }
  });
  L0A2M0T0I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A2M0T0I0Theta0N0J0(siValue);
  };
  L0A2M0T0I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A2M0T0I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A2M0T0I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A2M0T0I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A2M0T0I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A2M0T0I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A2M0T0I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A2M0T0I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A2M0T0I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A2M0T0I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A2M0T0I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A2M0T0I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A2M0T0I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A2M0T0I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A2M0T0I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A2M0T0I0Theta0N0J0',
    interfaces: [Quan]
  };
  L0A2M0T0I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A2M0T0I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A2M0T0I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Steradian = defineInlineFunction('output.info.kunalsheth.units.generated.get_Steradian_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A2M0T0I0Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A2M0T0I0Theta0N0J0;
    return function ($receiver) {
      return new L0A2M0T0I0Theta0N0J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Steradian_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Steradian_mt81fn$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Steradian() {
    Steradian_instance = this;
    this.$delegate_z7zydu$_0 = box(new L0A2M0T0I0Theta0N0J0(1.0));
    this.unitName_fiotlh$_0 = 'Steradian';
  }
  Object.defineProperty(Steradian.prototype, 'unitName', {
    get: function () {
      return this.unitName_fiotlh$_0;
    }
  });
  Steradian.prototype.invoke_14dthe$ = function (x) {
    return new L0A2M0T0I0Theta0N0J0(numberToDouble(x) * 1.0);
  };
  Steradian.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Steradian.prototype, 'abrev', {
    get: function () {
      return this.$delegate_z7zydu$_0.abrev;
    }
  });
  Object.defineProperty(Steradian.prototype, 'abs', {
    get: function () {
      return this.$delegate_z7zydu$_0.abs;
    }
  });
  Object.defineProperty(Steradian.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_z7zydu$_0.isNegative;
    }
  });
  Object.defineProperty(Steradian.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_z7zydu$_0.isPositive;
    }
  });
  Object.defineProperty(Steradian.prototype, 'isZero', {
    get: function () {
      return this.$delegate_z7zydu$_0.isZero;
    }
  });
  Object.defineProperty(Steradian.prototype, 'siValue', {
    get: function () {
      return this.$delegate_z7zydu$_0.siValue;
    }
  });
  Object.defineProperty(Steradian.prototype, 'signum', {
    get: function () {
      return this.$delegate_z7zydu$_0.signum;
    }
  });
  Steradian.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_z7zydu$_0.compareTo_11rb$(other);
  };
  Steradian.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_z7zydu$_0.div_3p81yu$(that);
  };
  Steradian.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_z7zydu$_0.max_j0rjbv$(that);
  };
  Steradian.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_z7zydu$_0.min_j0rjbv$(that);
  };
  Steradian.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_z7zydu$_0.minus_j0rjbv$(that);
  };
  Steradian.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_z7zydu$_0.new_14dthe$(siValue);
  };
  Steradian.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_z7zydu$_0.plus_j0rjbv$(that);
  };
  Steradian.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_z7zydu$_0.rem_j0rjbv$(that);
  };
  Steradian.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_z7zydu$_0.times_3p81yu$(that);
  };
  Steradian.prototype.unaryMinus = function () {
    return this.$delegate_z7zydu$_0.unaryMinus();
  };
  Steradian.prototype.unaryPlus = function () {
    return this.$delegate_z7zydu$_0.unaryPlus();
  };
  Steradian.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Steradian',
    interfaces: [Quan, UomConverter]
  };
  var Steradian_instance = null;
  function Steradian_getInstance() {
    if (Steradian_instance === null) {
      new Steradian();
    }
    return Steradian_instance;
  }
  function L1A0M1I0Theta0N0J0_per_T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T2.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5kg\u22C5s\u207B\xB2';
    }
  });
  L1A0M1I0Theta0N0J0_per_T2.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M1I0Theta0N0J0_per_T2(siValue);
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.unaryPlus = function () {
    return new L1A0M1I0Theta0N0J0_per_T2(+this.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.unaryMinus = function () {
    return new L1A0M1I0Theta0N0J0_per_T2(-this.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.times_3p81yu$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.div_3p81yu$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M1I0Theta0N0J0_per_T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M1I0Theta0N0J0_per_T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M1I0Theta0N0J0_per_T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M1I0Theta0N0J0_per_T2',
    interfaces: [Quan]
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M1I0Theta0N0J0_per_T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Newton = defineInlineFunction('output.info.kunalsheth.units.generated.get_Newton_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L1A0M1I0Theta0N0J0_per_T2_init = _.info.kunalsheth.units.generated.L1A0M1I0Theta0N0J0_per_T2;
    return function ($receiver) {
      return new L1A0M1I0Theta0N0J0_per_T2_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Newton_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Newton_1bwcn4$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Newton() {
    Newton_instance = this;
    this.$delegate_xmzecq$_0 = box(new L1A0M1I0Theta0N0J0_per_T2(1.0));
    this.unitName_hn0049$_0 = 'Newton';
  }
  Object.defineProperty(Newton.prototype, 'unitName', {
    get: function () {
      return this.unitName_hn0049$_0;
    }
  });
  Newton.prototype.invoke_14dthe$ = function (x) {
    return new L1A0M1I0Theta0N0J0_per_T2(numberToDouble(x) * 1.0);
  };
  Newton.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Newton.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xmzecq$_0.abrev;
    }
  });
  Object.defineProperty(Newton.prototype, 'abs', {
    get: function () {
      return this.$delegate_xmzecq$_0.abs;
    }
  });
  Object.defineProperty(Newton.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xmzecq$_0.isNegative;
    }
  });
  Object.defineProperty(Newton.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xmzecq$_0.isPositive;
    }
  });
  Object.defineProperty(Newton.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xmzecq$_0.isZero;
    }
  });
  Object.defineProperty(Newton.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xmzecq$_0.siValue;
    }
  });
  Object.defineProperty(Newton.prototype, 'signum', {
    get: function () {
      return this.$delegate_xmzecq$_0.signum;
    }
  });
  Newton.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xmzecq$_0.compareTo_11rb$(other);
  };
  Newton.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xmzecq$_0.div_3p81yu$(that);
  };
  Newton.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xmzecq$_0.max_j0rjbv$(that);
  };
  Newton.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xmzecq$_0.min_j0rjbv$(that);
  };
  Newton.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xmzecq$_0.minus_j0rjbv$(that);
  };
  Newton.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xmzecq$_0.new_14dthe$(siValue);
  };
  Newton.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xmzecq$_0.plus_j0rjbv$(that);
  };
  Newton.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xmzecq$_0.rem_j0rjbv$(that);
  };
  Newton.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xmzecq$_0.times_3p81yu$(that);
  };
  Newton.prototype.unaryMinus = function () {
    return this.$delegate_xmzecq$_0.unaryMinus();
  };
  Newton.prototype.unaryPlus = function () {
    return this.$delegate_xmzecq$_0.unaryPlus();
  };
  Newton.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Newton',
    interfaces: [Quan, UomConverter]
  };
  var Newton_instance = null;
  function Newton_getInstance() {
    if (Newton_instance === null) {
      new Newton();
    }
    return Newton_instance;
  }
  function A0M1I0Theta0N0J0_per_L1T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T2.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5kg\u22C5s\u207B\xB2';
    }
  });
  A0M1I0Theta0N0J0_per_L1T2.prototype.new_14dthe$ = function (siValue) {
    return new A0M1I0Theta0N0J0_per_L1T2(siValue);
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.unaryPlus = function () {
    return new A0M1I0Theta0N0J0_per_L1T2(+this.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.unaryMinus = function () {
    return new A0M1I0Theta0N0J0_per_L1T2(-this.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.plus_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.minus_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.times_3p81yu$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.div_3p81yu$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.rem_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M1I0Theta0N0J0_per_L1T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M1I0Theta0N0J0_per_L1T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M1I0Theta0N0J0_per_L1T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M1I0Theta0N0J0_per_L1T2',
    interfaces: [Quan]
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M1I0Theta0N0J0_per_L1T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Pascal = defineInlineFunction('output.info.kunalsheth.units.generated.get_Pascal_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var A0M1I0Theta0N0J0_per_L1T2_init = _.info.kunalsheth.units.generated.A0M1I0Theta0N0J0_per_L1T2;
    return function ($receiver) {
      return new A0M1I0Theta0N0J0_per_L1T2_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Pascal_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Pascal_i9xpre$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Pascal() {
    Pascal_instance = this;
    this.$delegate_yisjvn$_0 = box(new A0M1I0Theta0N0J0_per_L1T2(1.0));
    this.unitName_b89ahs$_0 = 'Pascal';
  }
  Object.defineProperty(Pascal.prototype, 'unitName', {
    get: function () {
      return this.unitName_b89ahs$_0;
    }
  });
  Pascal.prototype.invoke_14dthe$ = function (x) {
    return new A0M1I0Theta0N0J0_per_L1T2(numberToDouble(x) * 1.0);
  };
  Pascal.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Pascal.prototype, 'abrev', {
    get: function () {
      return this.$delegate_yisjvn$_0.abrev;
    }
  });
  Object.defineProperty(Pascal.prototype, 'abs', {
    get: function () {
      return this.$delegate_yisjvn$_0.abs;
    }
  });
  Object.defineProperty(Pascal.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_yisjvn$_0.isNegative;
    }
  });
  Object.defineProperty(Pascal.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_yisjvn$_0.isPositive;
    }
  });
  Object.defineProperty(Pascal.prototype, 'isZero', {
    get: function () {
      return this.$delegate_yisjvn$_0.isZero;
    }
  });
  Object.defineProperty(Pascal.prototype, 'siValue', {
    get: function () {
      return this.$delegate_yisjvn$_0.siValue;
    }
  });
  Object.defineProperty(Pascal.prototype, 'signum', {
    get: function () {
      return this.$delegate_yisjvn$_0.signum;
    }
  });
  Pascal.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_yisjvn$_0.compareTo_11rb$(other);
  };
  Pascal.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_yisjvn$_0.div_3p81yu$(that);
  };
  Pascal.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_yisjvn$_0.max_j0rjbv$(that);
  };
  Pascal.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_yisjvn$_0.min_j0rjbv$(that);
  };
  Pascal.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_yisjvn$_0.minus_j0rjbv$(that);
  };
  Pascal.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_yisjvn$_0.new_14dthe$(siValue);
  };
  Pascal.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_yisjvn$_0.plus_j0rjbv$(that);
  };
  Pascal.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_yisjvn$_0.rem_j0rjbv$(that);
  };
  Pascal.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_yisjvn$_0.times_3p81yu$(that);
  };
  Pascal.prototype.unaryMinus = function () {
    return this.$delegate_yisjvn$_0.unaryMinus();
  };
  Pascal.prototype.unaryPlus = function () {
    return this.$delegate_yisjvn$_0.unaryPlus();
  };
  Pascal.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Pascal',
    interfaces: [Quan, UomConverter]
  };
  var Pascal_instance = null;
  function Pascal_getInstance() {
    if (Pascal_instance === null) {
      new Pascal();
    }
    return Pascal_instance;
  }
  function L0A0M0T1I1Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T1I1Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T1I1Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 's\u22C5A';
    }
  });
  L0A0M0T1I1Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T1I1Theta0N0J0(siValue);
  };
  L0A0M0T1I1Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A0M0T1I1Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A0M0T1I1Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A0M0T1I1Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A0M0T1I1Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T1I1Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T1I1Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T1I1Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T1I1Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T1I1Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T1I1Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T1I1Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T1I1Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T1I1Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T1I1Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T1I1Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T1I1Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T1I1Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T1I1Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T1I1Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T1I1Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T1I1Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T1I1Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T1I1Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T1I1Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T1I1Theta0N0J0',
    interfaces: [Quan]
  };
  L0A0M0T1I1Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T1I1Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T1I1Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Coulomb = defineInlineFunction('output.info.kunalsheth.units.generated.get_Coulomb_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0T1I1Theta0N0J0_init = _.info.kunalsheth.units.generated.L0A0M0T1I1Theta0N0J0;
    return function ($receiver) {
      return new L0A0M0T1I1Theta0N0J0_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Coulomb_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Coulomb_lgrrb1$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Coulomb() {
    Coulomb_instance = this;
    this.$delegate_xnz3pm$_0 = box(new L0A0M0T1I1Theta0N0J0(1.0));
    this.unitName_t0l6dj$_0 = 'Coulomb';
  }
  Object.defineProperty(Coulomb.prototype, 'unitName', {
    get: function () {
      return this.unitName_t0l6dj$_0;
    }
  });
  Coulomb.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0T1I1Theta0N0J0(numberToDouble(x) * 1.0);
  };
  Coulomb.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Coulomb.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xnz3pm$_0.abrev;
    }
  });
  Object.defineProperty(Coulomb.prototype, 'abs', {
    get: function () {
      return this.$delegate_xnz3pm$_0.abs;
    }
  });
  Object.defineProperty(Coulomb.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xnz3pm$_0.isNegative;
    }
  });
  Object.defineProperty(Coulomb.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xnz3pm$_0.isPositive;
    }
  });
  Object.defineProperty(Coulomb.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xnz3pm$_0.isZero;
    }
  });
  Object.defineProperty(Coulomb.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xnz3pm$_0.siValue;
    }
  });
  Object.defineProperty(Coulomb.prototype, 'signum', {
    get: function () {
      return this.$delegate_xnz3pm$_0.signum;
    }
  });
  Coulomb.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xnz3pm$_0.compareTo_11rb$(other);
  };
  Coulomb.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xnz3pm$_0.div_3p81yu$(that);
  };
  Coulomb.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xnz3pm$_0.max_j0rjbv$(that);
  };
  Coulomb.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xnz3pm$_0.min_j0rjbv$(that);
  };
  Coulomb.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xnz3pm$_0.minus_j0rjbv$(that);
  };
  Coulomb.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xnz3pm$_0.new_14dthe$(siValue);
  };
  Coulomb.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xnz3pm$_0.plus_j0rjbv$(that);
  };
  Coulomb.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xnz3pm$_0.rem_j0rjbv$(that);
  };
  Coulomb.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xnz3pm$_0.times_3p81yu$(that);
  };
  Coulomb.prototype.unaryMinus = function () {
    return this.$delegate_xnz3pm$_0.unaryMinus();
  };
  Coulomb.prototype.unaryPlus = function () {
    return this.$delegate_xnz3pm$_0.unaryPlus();
  };
  Coulomb.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Coulomb',
    interfaces: [Quan, UomConverter]
  };
  var Coulomb_instance = null;
  function Coulomb_getInstance() {
    if (Coulomb_instance === null) {
      new Coulomb();
    }
    return Coulomb_instance;
  }
  function L2A0M1Theta0N0J0_per_T3I1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I1.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB3\u22C5A\u207B\xB9';
    }
  });
  L2A0M1Theta0N0J0_per_T3I1.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1Theta0N0J0_per_T3I1(siValue);
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.unaryPlus = function () {
    return new L2A0M1Theta0N0J0_per_T3I1(+this.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.unaryMinus = function () {
    return new L2A0M1Theta0N0J0_per_T3I1(-this.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1Theta0N0J0_per_T3I1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1Theta0N0J0_per_T3I1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1Theta0N0J0_per_T3I1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1Theta0N0J0_per_T3I1',
    interfaces: [Quan]
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1Theta0N0J0_per_T3I1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Volt = defineInlineFunction('output.info.kunalsheth.units.generated.get_Volt_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L2A0M1Theta0N0J0_per_T3I1_init = _.info.kunalsheth.units.generated.L2A0M1Theta0N0J0_per_T3I1;
    return function ($receiver) {
      return new L2A0M1Theta0N0J0_per_T3I1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Volt_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Volt_6qm567$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Volt() {
    Volt_instance = this;
    this.$delegate_xdgu48$_0 = box(new L2A0M1Theta0N0J0_per_T3I1(1.0));
    this.unitName_7kydx1$_0 = 'Volt';
  }
  Object.defineProperty(Volt.prototype, 'unitName', {
    get: function () {
      return this.unitName_7kydx1$_0;
    }
  });
  Volt.prototype.invoke_14dthe$ = function (x) {
    return new L2A0M1Theta0N0J0_per_T3I1(numberToDouble(x) * 1.0);
  };
  Volt.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Volt.prototype, 'abrev', {
    get: function () {
      return this.$delegate_xdgu48$_0.abrev;
    }
  });
  Object.defineProperty(Volt.prototype, 'abs', {
    get: function () {
      return this.$delegate_xdgu48$_0.abs;
    }
  });
  Object.defineProperty(Volt.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_xdgu48$_0.isNegative;
    }
  });
  Object.defineProperty(Volt.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_xdgu48$_0.isPositive;
    }
  });
  Object.defineProperty(Volt.prototype, 'isZero', {
    get: function () {
      return this.$delegate_xdgu48$_0.isZero;
    }
  });
  Object.defineProperty(Volt.prototype, 'siValue', {
    get: function () {
      return this.$delegate_xdgu48$_0.siValue;
    }
  });
  Object.defineProperty(Volt.prototype, 'signum', {
    get: function () {
      return this.$delegate_xdgu48$_0.signum;
    }
  });
  Volt.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_xdgu48$_0.compareTo_11rb$(other);
  };
  Volt.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_xdgu48$_0.div_3p81yu$(that);
  };
  Volt.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_xdgu48$_0.max_j0rjbv$(that);
  };
  Volt.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_xdgu48$_0.min_j0rjbv$(that);
  };
  Volt.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_xdgu48$_0.minus_j0rjbv$(that);
  };
  Volt.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_xdgu48$_0.new_14dthe$(siValue);
  };
  Volt.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_xdgu48$_0.plus_j0rjbv$(that);
  };
  Volt.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_xdgu48$_0.rem_j0rjbv$(that);
  };
  Volt.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_xdgu48$_0.times_3p81yu$(that);
  };
  Volt.prototype.unaryMinus = function () {
    return this.$delegate_xdgu48$_0.unaryMinus();
  };
  Volt.prototype.unaryPlus = function () {
    return this.$delegate_xdgu48$_0.unaryPlus();
  };
  Volt.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Volt',
    interfaces: [Quan, UomConverter]
  };
  var Volt_instance = null;
  function Volt_getInstance() {
    if (Volt_instance === null) {
      new Volt();
    }
    return Volt_instance;
  }
  function A0T4I2Theta0N0J0_per_L2M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T4I2Theta0N0J0_per_L2M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L2M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5kg\u207B\xB9\u22C5s\u2074\u22C5A\xB2';
    }
  });
  A0T4I2Theta0N0J0_per_L2M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T4I2Theta0N0J0_per_L2M1(siValue);
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.unaryPlus = function () {
    return new A0T4I2Theta0N0J0_per_L2M1(+this.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.unaryMinus = function () {
    return new A0T4I2Theta0N0J0_per_L2M1(-this.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.times_3p81yu$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.div_3p81yu$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T4I2Theta0N0J0_per_L2M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T4I2Theta0N0J0_per_L2M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L2M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L2M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L2M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L2M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T4I2Theta0N0J0_per_L2M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T4I2Theta0N0J0_per_L2M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T4I2Theta0N0J0_per_L2M1',
    interfaces: [Quan]
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T4I2Theta0N0J0_per_L2M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Farad = defineInlineFunction('output.info.kunalsheth.units.generated.get_Farad_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var A0T4I2Theta0N0J0_per_L2M1_init = _.info.kunalsheth.units.generated.A0T4I2Theta0N0J0_per_L2M1;
    return function ($receiver) {
      return new A0T4I2Theta0N0J0_per_L2M1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Farad_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Farad_sbbr2r$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Farad() {
    Farad_instance = this;
    this.$delegate_v48f8d$_0 = box(new A0T4I2Theta0N0J0_per_L2M1(1.0));
    this.unitName_5bngyo$_0 = 'Farad';
  }
  Object.defineProperty(Farad.prototype, 'unitName', {
    get: function () {
      return this.unitName_5bngyo$_0;
    }
  });
  Farad.prototype.invoke_14dthe$ = function (x) {
    return new A0T4I2Theta0N0J0_per_L2M1(numberToDouble(x) * 1.0);
  };
  Farad.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Farad.prototype, 'abrev', {
    get: function () {
      return this.$delegate_v48f8d$_0.abrev;
    }
  });
  Object.defineProperty(Farad.prototype, 'abs', {
    get: function () {
      return this.$delegate_v48f8d$_0.abs;
    }
  });
  Object.defineProperty(Farad.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_v48f8d$_0.isNegative;
    }
  });
  Object.defineProperty(Farad.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_v48f8d$_0.isPositive;
    }
  });
  Object.defineProperty(Farad.prototype, 'isZero', {
    get: function () {
      return this.$delegate_v48f8d$_0.isZero;
    }
  });
  Object.defineProperty(Farad.prototype, 'siValue', {
    get: function () {
      return this.$delegate_v48f8d$_0.siValue;
    }
  });
  Object.defineProperty(Farad.prototype, 'signum', {
    get: function () {
      return this.$delegate_v48f8d$_0.signum;
    }
  });
  Farad.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_v48f8d$_0.compareTo_11rb$(other);
  };
  Farad.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_v48f8d$_0.div_3p81yu$(that);
  };
  Farad.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_v48f8d$_0.max_j0rjbv$(that);
  };
  Farad.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_v48f8d$_0.min_j0rjbv$(that);
  };
  Farad.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_v48f8d$_0.minus_j0rjbv$(that);
  };
  Farad.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_v48f8d$_0.new_14dthe$(siValue);
  };
  Farad.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_v48f8d$_0.plus_j0rjbv$(that);
  };
  Farad.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_v48f8d$_0.rem_j0rjbv$(that);
  };
  Farad.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_v48f8d$_0.times_3p81yu$(that);
  };
  Farad.prototype.unaryMinus = function () {
    return this.$delegate_v48f8d$_0.unaryMinus();
  };
  Farad.prototype.unaryPlus = function () {
    return this.$delegate_v48f8d$_0.unaryPlus();
  };
  Farad.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Farad',
    interfaces: [Quan, UomConverter]
  };
  var Farad_instance = null;
  function Farad_getInstance() {
    if (Farad_instance === null) {
      new Farad();
    }
    return Farad_instance;
  }
  function L2A0M1Theta0N0J0_per_T3I2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I2.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB3\u22C5A\u207B\xB2';
    }
  });
  L2A0M1Theta0N0J0_per_T3I2.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1Theta0N0J0_per_T3I2(siValue);
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.unaryPlus = function () {
    return new L2A0M1Theta0N0J0_per_T3I2(+this.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.unaryMinus = function () {
    return new L2A0M1Theta0N0J0_per_T3I2(-this.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1Theta0N0J0_per_T3I2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T3I2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1Theta0N0J0_per_T3I2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1Theta0N0J0_per_T3I2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1Theta0N0J0_per_T3I2',
    interfaces: [Quan]
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1Theta0N0J0_per_T3I2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Ohm = defineInlineFunction('output.info.kunalsheth.units.generated.get_Ohm_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L2A0M1Theta0N0J0_per_T3I2_init = _.info.kunalsheth.units.generated.L2A0M1Theta0N0J0_per_T3I2;
    return function ($receiver) {
      return new L2A0M1Theta0N0J0_per_T3I2_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Ohm_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Ohm_6qm55c$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Ohm() {
    Ohm_instance = this;
    this.$delegate_qa45lp$_0 = box(new L2A0M1Theta0N0J0_per_T3I2(1.0));
    this.unitName_87gep2$_0 = 'Ohm';
  }
  Object.defineProperty(Ohm.prototype, 'unitName', {
    get: function () {
      return this.unitName_87gep2$_0;
    }
  });
  Ohm.prototype.invoke_14dthe$ = function (x) {
    return new L2A0M1Theta0N0J0_per_T3I2(numberToDouble(x) * 1.0);
  };
  Ohm.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Ohm.prototype, 'abrev', {
    get: function () {
      return this.$delegate_qa45lp$_0.abrev;
    }
  });
  Object.defineProperty(Ohm.prototype, 'abs', {
    get: function () {
      return this.$delegate_qa45lp$_0.abs;
    }
  });
  Object.defineProperty(Ohm.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_qa45lp$_0.isNegative;
    }
  });
  Object.defineProperty(Ohm.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_qa45lp$_0.isPositive;
    }
  });
  Object.defineProperty(Ohm.prototype, 'isZero', {
    get: function () {
      return this.$delegate_qa45lp$_0.isZero;
    }
  });
  Object.defineProperty(Ohm.prototype, 'siValue', {
    get: function () {
      return this.$delegate_qa45lp$_0.siValue;
    }
  });
  Object.defineProperty(Ohm.prototype, 'signum', {
    get: function () {
      return this.$delegate_qa45lp$_0.signum;
    }
  });
  Ohm.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_qa45lp$_0.compareTo_11rb$(other);
  };
  Ohm.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_qa45lp$_0.div_3p81yu$(that);
  };
  Ohm.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_qa45lp$_0.max_j0rjbv$(that);
  };
  Ohm.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_qa45lp$_0.min_j0rjbv$(that);
  };
  Ohm.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_qa45lp$_0.minus_j0rjbv$(that);
  };
  Ohm.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_qa45lp$_0.new_14dthe$(siValue);
  };
  Ohm.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_qa45lp$_0.plus_j0rjbv$(that);
  };
  Ohm.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_qa45lp$_0.rem_j0rjbv$(that);
  };
  Ohm.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_qa45lp$_0.times_3p81yu$(that);
  };
  Ohm.prototype.unaryMinus = function () {
    return this.$delegate_qa45lp$_0.unaryMinus();
  };
  Ohm.prototype.unaryPlus = function () {
    return this.$delegate_qa45lp$_0.unaryPlus();
  };
  Ohm.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Ohm',
    interfaces: [Quan, UomConverter]
  };
  var Ohm_instance = null;
  function Ohm_getInstance() {
    if (Ohm_instance === null) {
      new Ohm();
    }
    return Ohm_instance;
  }
  function A0T3I2Theta0N0J0_per_L2M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T3I2Theta0N0J0_per_L2M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L2M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5kg\u207B\xB9\u22C5s\xB3\u22C5A\xB2';
    }
  });
  A0T3I2Theta0N0J0_per_L2M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T3I2Theta0N0J0_per_L2M1(siValue);
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.unaryPlus = function () {
    return new A0T3I2Theta0N0J0_per_L2M1(+this.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.unaryMinus = function () {
    return new A0T3I2Theta0N0J0_per_L2M1(-this.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.times_3p81yu$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.div_3p81yu$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T3I2Theta0N0J0_per_L2M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T3I2Theta0N0J0_per_L2M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L2M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L2M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L2M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L2M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T3I2Theta0N0J0_per_L2M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T3I2Theta0N0J0_per_L2M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T3I2Theta0N0J0_per_L2M1',
    interfaces: [Quan]
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T3I2Theta0N0J0_per_L2M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Siemens = defineInlineFunction('output.info.kunalsheth.units.generated.get_Siemens_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var A0T3I2Theta0N0J0_per_L2M1_init = _.info.kunalsheth.units.generated.A0T3I2Theta0N0J0_per_L2M1;
    return function ($receiver) {
      return new A0T3I2Theta0N0J0_per_L2M1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Siemens_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Siemens_m4ooh8$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Siemens() {
    Siemens_instance = this;
    this.$delegate_ip6kvf$_0 = box(new A0T3I2Theta0N0J0_per_L2M1(1.0));
    this.unitName_24tez6$_0 = 'Siemens';
  }
  Object.defineProperty(Siemens.prototype, 'unitName', {
    get: function () {
      return this.unitName_24tez6$_0;
    }
  });
  Siemens.prototype.invoke_14dthe$ = function (x) {
    return new A0T3I2Theta0N0J0_per_L2M1(numberToDouble(x) * 1.0);
  };
  Siemens.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Siemens.prototype, 'abrev', {
    get: function () {
      return this.$delegate_ip6kvf$_0.abrev;
    }
  });
  Object.defineProperty(Siemens.prototype, 'abs', {
    get: function () {
      return this.$delegate_ip6kvf$_0.abs;
    }
  });
  Object.defineProperty(Siemens.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_ip6kvf$_0.isNegative;
    }
  });
  Object.defineProperty(Siemens.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_ip6kvf$_0.isPositive;
    }
  });
  Object.defineProperty(Siemens.prototype, 'isZero', {
    get: function () {
      return this.$delegate_ip6kvf$_0.isZero;
    }
  });
  Object.defineProperty(Siemens.prototype, 'siValue', {
    get: function () {
      return this.$delegate_ip6kvf$_0.siValue;
    }
  });
  Object.defineProperty(Siemens.prototype, 'signum', {
    get: function () {
      return this.$delegate_ip6kvf$_0.signum;
    }
  });
  Siemens.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_ip6kvf$_0.compareTo_11rb$(other);
  };
  Siemens.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_ip6kvf$_0.div_3p81yu$(that);
  };
  Siemens.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_ip6kvf$_0.max_j0rjbv$(that);
  };
  Siemens.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_ip6kvf$_0.min_j0rjbv$(that);
  };
  Siemens.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_ip6kvf$_0.minus_j0rjbv$(that);
  };
  Siemens.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_ip6kvf$_0.new_14dthe$(siValue);
  };
  Siemens.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_ip6kvf$_0.plus_j0rjbv$(that);
  };
  Siemens.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_ip6kvf$_0.rem_j0rjbv$(that);
  };
  Siemens.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_ip6kvf$_0.times_3p81yu$(that);
  };
  Siemens.prototype.unaryMinus = function () {
    return this.$delegate_ip6kvf$_0.unaryMinus();
  };
  Siemens.prototype.unaryPlus = function () {
    return this.$delegate_ip6kvf$_0.unaryPlus();
  };
  Siemens.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Siemens',
    interfaces: [Quan, UomConverter]
  };
  var Siemens_instance = null;
  function Siemens_getInstance() {
    if (Siemens_instance === null) {
      new Siemens();
    }
    return Siemens_instance;
  }
  function L2A0M1Theta0N0J0_per_T2I1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I1.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB2\u22C5A\u207B\xB9';
    }
  });
  L2A0M1Theta0N0J0_per_T2I1.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1Theta0N0J0_per_T2I1(siValue);
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.unaryPlus = function () {
    return new L2A0M1Theta0N0J0_per_T2I1(+this.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.unaryMinus = function () {
    return new L2A0M1Theta0N0J0_per_T2I1(-this.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1Theta0N0J0_per_T2I1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1Theta0N0J0_per_T2I1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1Theta0N0J0_per_T2I1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1Theta0N0J0_per_T2I1',
    interfaces: [Quan]
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1Theta0N0J0_per_T2I1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Weber = defineInlineFunction('output.info.kunalsheth.units.generated.get_Weber_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L2A0M1Theta0N0J0_per_T2I1_init = _.info.kunalsheth.units.generated.L2A0M1Theta0N0J0_per_T2I1;
    return function ($receiver) {
      return new L2A0M1Theta0N0J0_per_T2I1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Weber_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Weber_6qms5q$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Weber() {
    Weber_instance = this;
    this.$delegate_uutoye$_0 = box(new L2A0M1Theta0N0J0_per_T2I1(1.0));
    this.unitName_56mis9$_0 = 'Weber';
  }
  Object.defineProperty(Weber.prototype, 'unitName', {
    get: function () {
      return this.unitName_56mis9$_0;
    }
  });
  Weber.prototype.invoke_14dthe$ = function (x) {
    return new L2A0M1Theta0N0J0_per_T2I1(numberToDouble(x) * 1.0);
  };
  Weber.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Weber.prototype, 'abrev', {
    get: function () {
      return this.$delegate_uutoye$_0.abrev;
    }
  });
  Object.defineProperty(Weber.prototype, 'abs', {
    get: function () {
      return this.$delegate_uutoye$_0.abs;
    }
  });
  Object.defineProperty(Weber.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_uutoye$_0.isNegative;
    }
  });
  Object.defineProperty(Weber.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_uutoye$_0.isPositive;
    }
  });
  Object.defineProperty(Weber.prototype, 'isZero', {
    get: function () {
      return this.$delegate_uutoye$_0.isZero;
    }
  });
  Object.defineProperty(Weber.prototype, 'siValue', {
    get: function () {
      return this.$delegate_uutoye$_0.siValue;
    }
  });
  Object.defineProperty(Weber.prototype, 'signum', {
    get: function () {
      return this.$delegate_uutoye$_0.signum;
    }
  });
  Weber.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_uutoye$_0.compareTo_11rb$(other);
  };
  Weber.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_uutoye$_0.div_3p81yu$(that);
  };
  Weber.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_uutoye$_0.max_j0rjbv$(that);
  };
  Weber.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_uutoye$_0.min_j0rjbv$(that);
  };
  Weber.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_uutoye$_0.minus_j0rjbv$(that);
  };
  Weber.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_uutoye$_0.new_14dthe$(siValue);
  };
  Weber.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_uutoye$_0.plus_j0rjbv$(that);
  };
  Weber.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_uutoye$_0.rem_j0rjbv$(that);
  };
  Weber.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_uutoye$_0.times_3p81yu$(that);
  };
  Weber.prototype.unaryMinus = function () {
    return this.$delegate_uutoye$_0.unaryMinus();
  };
  Weber.prototype.unaryPlus = function () {
    return this.$delegate_uutoye$_0.unaryPlus();
  };
  Weber.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Weber',
    interfaces: [Quan, UomConverter]
  };
  var Weber_instance = null;
  function Weber_getInstance() {
    if (Weber_instance === null) {
      new Weber();
    }
    return Weber_instance;
  }
  function L0A0M1Theta0N0J0_per_T2I1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M1Theta0N0J0_per_T2I1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M1Theta0N0J0_per_T2I1.prototype, 'abrev', {
    get: function () {
      return 'kg\u22C5s\u207B\xB2\u22C5A\u207B\xB9';
    }
  });
  L0A0M1Theta0N0J0_per_T2I1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M1Theta0N0J0_per_T2I1(siValue);
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.unaryPlus = function () {
    return new L0A0M1Theta0N0J0_per_T2I1(+this.underlying_8be2vx$);
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.unaryMinus = function () {
    return new L0A0M1Theta0N0J0_per_T2I1(-this.underlying_8be2vx$);
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.times_3p81yu$ = function (that) {
    return new L0A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.div_3p81yu$ = function (that) {
    return new L0A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M1Theta0N0J0_per_T2I1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M1Theta0N0J0_per_T2I1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M1Theta0N0J0_per_T2I1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M1Theta0N0J0_per_T2I1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M1Theta0N0J0_per_T2I1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M1Theta0N0J0_per_T2I1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M1Theta0N0J0_per_T2I1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M1Theta0N0J0_per_T2I1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M1Theta0N0J0_per_T2I1',
    interfaces: [Quan]
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M1Theta0N0J0_per_T2I1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Tesla = defineInlineFunction('output.info.kunalsheth.units.generated.get_Tesla_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M1Theta0N0J0_per_T2I1_init = _.info.kunalsheth.units.generated.L0A0M1Theta0N0J0_per_T2I1;
    return function ($receiver) {
      return new L0A0M1Theta0N0J0_per_T2I1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Tesla_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Tesla_92b85s$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Tesla() {
    Tesla_instance = this;
    this.$delegate_uwgpz4$_0 = box(new L0A0M1Theta0N0J0_per_T2I1(1.0));
    this.unitName_2j28sd$_0 = 'Tesla';
  }
  Object.defineProperty(Tesla.prototype, 'unitName', {
    get: function () {
      return this.unitName_2j28sd$_0;
    }
  });
  Tesla.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M1Theta0N0J0_per_T2I1(numberToDouble(x) * 1.0);
  };
  Tesla.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Tesla.prototype, 'abrev', {
    get: function () {
      return this.$delegate_uwgpz4$_0.abrev;
    }
  });
  Object.defineProperty(Tesla.prototype, 'abs', {
    get: function () {
      return this.$delegate_uwgpz4$_0.abs;
    }
  });
  Object.defineProperty(Tesla.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_uwgpz4$_0.isNegative;
    }
  });
  Object.defineProperty(Tesla.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_uwgpz4$_0.isPositive;
    }
  });
  Object.defineProperty(Tesla.prototype, 'isZero', {
    get: function () {
      return this.$delegate_uwgpz4$_0.isZero;
    }
  });
  Object.defineProperty(Tesla.prototype, 'siValue', {
    get: function () {
      return this.$delegate_uwgpz4$_0.siValue;
    }
  });
  Object.defineProperty(Tesla.prototype, 'signum', {
    get: function () {
      return this.$delegate_uwgpz4$_0.signum;
    }
  });
  Tesla.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_uwgpz4$_0.compareTo_11rb$(other);
  };
  Tesla.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_uwgpz4$_0.div_3p81yu$(that);
  };
  Tesla.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_uwgpz4$_0.max_j0rjbv$(that);
  };
  Tesla.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_uwgpz4$_0.min_j0rjbv$(that);
  };
  Tesla.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_uwgpz4$_0.minus_j0rjbv$(that);
  };
  Tesla.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_uwgpz4$_0.new_14dthe$(siValue);
  };
  Tesla.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_uwgpz4$_0.plus_j0rjbv$(that);
  };
  Tesla.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_uwgpz4$_0.rem_j0rjbv$(that);
  };
  Tesla.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_uwgpz4$_0.times_3p81yu$(that);
  };
  Tesla.prototype.unaryMinus = function () {
    return this.$delegate_uwgpz4$_0.unaryMinus();
  };
  Tesla.prototype.unaryPlus = function () {
    return this.$delegate_uwgpz4$_0.unaryPlus();
  };
  Tesla.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Tesla',
    interfaces: [Quan, UomConverter]
  };
  var Tesla_instance = null;
  function Tesla_getInstance() {
    if (Tesla_instance === null) {
      new Tesla();
    }
    return Tesla_instance;
  }
  function L2A0M1Theta0N0J0_per_T2I2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I2.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB2\u22C5A\u207B\xB2';
    }
  });
  L2A0M1Theta0N0J0_per_T2I2.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1Theta0N0J0_per_T2I2(siValue);
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.unaryPlus = function () {
    return new L2A0M1Theta0N0J0_per_T2I2(+this.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.unaryMinus = function () {
    return new L2A0M1Theta0N0J0_per_T2I2(-this.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1Theta0N0J0_per_T2I2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1Theta0N0J0_per_T2I2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1Theta0N0J0_per_T2I2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1Theta0N0J0_per_T2I2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1Theta0N0J0_per_T2I2',
    interfaces: [Quan]
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1Theta0N0J0_per_T2I2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Henry = defineInlineFunction('output.info.kunalsheth.units.generated.get_Henry_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L2A0M1Theta0N0J0_per_T2I2_init = _.info.kunalsheth.units.generated.L2A0M1Theta0N0J0_per_T2I2;
    return function ($receiver) {
      return new L2A0M1Theta0N0J0_per_T2I2_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Henry_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Henry_6qms4v$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Henry() {
    Henry_instance = this;
    this.$delegate_v32cn3$_0 = box(new L2A0M1Theta0N0J0_per_T2I2(1.0));
    this.unitName_llvvlq$_0 = 'Henry';
  }
  Object.defineProperty(Henry.prototype, 'unitName', {
    get: function () {
      return this.unitName_llvvlq$_0;
    }
  });
  Henry.prototype.invoke_14dthe$ = function (x) {
    return new L2A0M1Theta0N0J0_per_T2I2(numberToDouble(x) * 1.0);
  };
  Henry.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Henry.prototype, 'abrev', {
    get: function () {
      return this.$delegate_v32cn3$_0.abrev;
    }
  });
  Object.defineProperty(Henry.prototype, 'abs', {
    get: function () {
      return this.$delegate_v32cn3$_0.abs;
    }
  });
  Object.defineProperty(Henry.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_v32cn3$_0.isNegative;
    }
  });
  Object.defineProperty(Henry.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_v32cn3$_0.isPositive;
    }
  });
  Object.defineProperty(Henry.prototype, 'isZero', {
    get: function () {
      return this.$delegate_v32cn3$_0.isZero;
    }
  });
  Object.defineProperty(Henry.prototype, 'siValue', {
    get: function () {
      return this.$delegate_v32cn3$_0.siValue;
    }
  });
  Object.defineProperty(Henry.prototype, 'signum', {
    get: function () {
      return this.$delegate_v32cn3$_0.signum;
    }
  });
  Henry.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_v32cn3$_0.compareTo_11rb$(other);
  };
  Henry.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_v32cn3$_0.div_3p81yu$(that);
  };
  Henry.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_v32cn3$_0.max_j0rjbv$(that);
  };
  Henry.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_v32cn3$_0.min_j0rjbv$(that);
  };
  Henry.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_v32cn3$_0.minus_j0rjbv$(that);
  };
  Henry.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_v32cn3$_0.new_14dthe$(siValue);
  };
  Henry.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_v32cn3$_0.plus_j0rjbv$(that);
  };
  Henry.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_v32cn3$_0.rem_j0rjbv$(that);
  };
  Henry.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_v32cn3$_0.times_3p81yu$(that);
  };
  Henry.prototype.unaryMinus = function () {
    return this.$delegate_v32cn3$_0.unaryMinus();
  };
  Henry.prototype.unaryPlus = function () {
    return this.$delegate_v32cn3$_0.unaryPlus();
  };
  Henry.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Henry',
    interfaces: [Quan, UomConverter]
  };
  var Henry_instance = null;
  function Henry_getInstance() {
    if (Henry_instance === null) {
      new Henry();
    }
    return Henry_instance;
  }
  function L0A2M0T0I0Theta0N0J1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A2M0T0I0Theta0N0J1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J1.prototype, 'abrev', {
    get: function () {
      return 'rad\xB2\u22C5cd';
    }
  });
  L0A2M0T0I0Theta0N0J1.prototype.new_14dthe$ = function (siValue) {
    return new L0A2M0T0I0Theta0N0J1(siValue);
  };
  L0A2M0T0I0Theta0N0J1.prototype.unaryPlus = function () {
    return new L0A2M0T0I0Theta0N0J1(+this.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J1.prototype.unaryMinus = function () {
    return new L0A2M0T0I0Theta0N0J1(-this.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A2M0T0I0Theta0N0J1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A2M0T0I0Theta0N0J1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J1.prototype.times_3p81yu$ = function (that) {
    return new L0A2M0T0I0Theta0N0J1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A2M0T0I0Theta0N0J1.prototype.div_3p81yu$ = function (that) {
    return new L0A2M0T0I0Theta0N0J1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A2M0T0I0Theta0N0J1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A2M0T0I0Theta0N0J1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A2M0T0I0Theta0N0J1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A2M0T0I0Theta0N0J1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A2M0T0I0Theta0N0J1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A2M0T0I0Theta0N0J1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A2M0T0I0Theta0N0J1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A2M0T0I0Theta0N0J1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A2M0T0I0Theta0N0J1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A2M0T0I0Theta0N0J1',
    interfaces: [Quan]
  };
  L0A2M0T0I0Theta0N0J1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A2M0T0I0Theta0N0J1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A2M0T0I0Theta0N0J1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Lumen = defineInlineFunction('output.info.kunalsheth.units.generated.get_Lumen_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A2M0T0I0Theta0N0J1_init = _.info.kunalsheth.units.generated.L0A2M0T0I0Theta0N0J1;
    return function ($receiver) {
      return new L0A2M0T0I0Theta0N0J1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Lumen_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Lumen_mt81gi$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Lumen() {
    Lumen_instance = this;
    this.$delegate_v0kzje$_0 = box(new L0A2M0T0I0Theta0N0J1(1.0));
    this.unitName_7fritv$_0 = 'Lumen';
  }
  Object.defineProperty(Lumen.prototype, 'unitName', {
    get: function () {
      return this.unitName_7fritv$_0;
    }
  });
  Lumen.prototype.invoke_14dthe$ = function (x) {
    return new L0A2M0T0I0Theta0N0J1(numberToDouble(x) * 1.0);
  };
  Lumen.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Lumen.prototype, 'abrev', {
    get: function () {
      return this.$delegate_v0kzje$_0.abrev;
    }
  });
  Object.defineProperty(Lumen.prototype, 'abs', {
    get: function () {
      return this.$delegate_v0kzje$_0.abs;
    }
  });
  Object.defineProperty(Lumen.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_v0kzje$_0.isNegative;
    }
  });
  Object.defineProperty(Lumen.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_v0kzje$_0.isPositive;
    }
  });
  Object.defineProperty(Lumen.prototype, 'isZero', {
    get: function () {
      return this.$delegate_v0kzje$_0.isZero;
    }
  });
  Object.defineProperty(Lumen.prototype, 'siValue', {
    get: function () {
      return this.$delegate_v0kzje$_0.siValue;
    }
  });
  Object.defineProperty(Lumen.prototype, 'signum', {
    get: function () {
      return this.$delegate_v0kzje$_0.signum;
    }
  });
  Lumen.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_v0kzje$_0.compareTo_11rb$(other);
  };
  Lumen.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_v0kzje$_0.div_3p81yu$(that);
  };
  Lumen.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_v0kzje$_0.max_j0rjbv$(that);
  };
  Lumen.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_v0kzje$_0.min_j0rjbv$(that);
  };
  Lumen.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_v0kzje$_0.minus_j0rjbv$(that);
  };
  Lumen.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_v0kzje$_0.new_14dthe$(siValue);
  };
  Lumen.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_v0kzje$_0.plus_j0rjbv$(that);
  };
  Lumen.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_v0kzje$_0.rem_j0rjbv$(that);
  };
  Lumen.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_v0kzje$_0.times_3p81yu$(that);
  };
  Lumen.prototype.unaryMinus = function () {
    return this.$delegate_v0kzje$_0.unaryMinus();
  };
  Lumen.prototype.unaryPlus = function () {
    return this.$delegate_v0kzje$_0.unaryPlus();
  };
  Lumen.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Lumen',
    interfaces: [Quan, UomConverter]
  };
  var Lumen_instance = null;
  function Lumen_getInstance() {
    if (Lumen_instance === null) {
      new Lumen();
    }
    return Lumen_instance;
  }
  function A0M0T0I0Theta0N0J1_per_L2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T0I0Theta0N0J1_per_L2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J1_per_L2.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5cd';
    }
  });
  A0M0T0I0Theta0N0J1_per_L2.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T0I0Theta0N0J1_per_L2(siValue);
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.unaryPlus = function () {
    return new A0M0T0I0Theta0N0J1_per_L2(+this.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.unaryMinus = function () {
    return new A0M0T0I0Theta0N0J1_per_L2(-this.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J1_per_L2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J1_per_L2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.times_3p81yu$ = function (that) {
    return new A0M0T0I0Theta0N0J1_per_L2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.div_3p81yu$ = function (that) {
    return new A0M0T0I0Theta0N0J1_per_L2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J1_per_L2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T0I0Theta0N0J1_per_L2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T0I0Theta0N0J1_per_L2(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J1_per_L2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J1_per_L2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J1_per_L2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J1_per_L2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T0I0Theta0N0J1_per_L2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T0I0Theta0N0J1_per_L2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T0I0Theta0N0J1_per_L2',
    interfaces: [Quan]
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T0I0Theta0N0J1_per_L2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Lux = defineInlineFunction('output.info.kunalsheth.units.generated.get_Lux_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var A0M0T0I0Theta0N0J1_per_L2_init = _.info.kunalsheth.units.generated.A0M0T0I0Theta0N0J1_per_L2;
    return function ($receiver) {
      return new A0M0T0I0Theta0N0J1_per_L2_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Lux_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Lux_svlfqn$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Lux() {
    Lux_instance = this;
    this.$delegate_qa43p4$_0 = box(new A0M0T0I0Theta0N0J1_per_L2(1.0));
    this.unitName_8ob7wr$_0 = 'Lux';
  }
  Object.defineProperty(Lux.prototype, 'unitName', {
    get: function () {
      return this.unitName_8ob7wr$_0;
    }
  });
  Lux.prototype.invoke_14dthe$ = function (x) {
    return new A0M0T0I0Theta0N0J1_per_L2(numberToDouble(x) * 1.0);
  };
  Lux.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Lux.prototype, 'abrev', {
    get: function () {
      return this.$delegate_qa43p4$_0.abrev;
    }
  });
  Object.defineProperty(Lux.prototype, 'abs', {
    get: function () {
      return this.$delegate_qa43p4$_0.abs;
    }
  });
  Object.defineProperty(Lux.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_qa43p4$_0.isNegative;
    }
  });
  Object.defineProperty(Lux.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_qa43p4$_0.isPositive;
    }
  });
  Object.defineProperty(Lux.prototype, 'isZero', {
    get: function () {
      return this.$delegate_qa43p4$_0.isZero;
    }
  });
  Object.defineProperty(Lux.prototype, 'siValue', {
    get: function () {
      return this.$delegate_qa43p4$_0.siValue;
    }
  });
  Object.defineProperty(Lux.prototype, 'signum', {
    get: function () {
      return this.$delegate_qa43p4$_0.signum;
    }
  });
  Lux.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_qa43p4$_0.compareTo_11rb$(other);
  };
  Lux.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_qa43p4$_0.div_3p81yu$(that);
  };
  Lux.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_qa43p4$_0.max_j0rjbv$(that);
  };
  Lux.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_qa43p4$_0.min_j0rjbv$(that);
  };
  Lux.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_qa43p4$_0.minus_j0rjbv$(that);
  };
  Lux.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_qa43p4$_0.new_14dthe$(siValue);
  };
  Lux.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_qa43p4$_0.plus_j0rjbv$(that);
  };
  Lux.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_qa43p4$_0.rem_j0rjbv$(that);
  };
  Lux.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_qa43p4$_0.times_3p81yu$(that);
  };
  Lux.prototype.unaryMinus = function () {
    return this.$delegate_qa43p4$_0.unaryMinus();
  };
  Lux.prototype.unaryPlus = function () {
    return this.$delegate_qa43p4$_0.unaryPlus();
  };
  Lux.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Lux',
    interfaces: [Quan, UomConverter]
  };
  var Lux_instance = null;
  function Lux_getInstance() {
    if (Lux_instance === null) {
      new Lux();
    }
    return Lux_instance;
  }
  function L0A0M0I0Theta0N1J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0I0Theta0N1J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N1J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 's\u207B\xB9\u22C5mol';
    }
  });
  L0A0M0I0Theta0N1J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0I0Theta0N1J0_per_T1(siValue);
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.unaryPlus = function () {
    return new L0A0M0I0Theta0N1J0_per_T1(+this.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.unaryMinus = function () {
    return new L0A0M0I0Theta0N1J0_per_T1(-this.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N1J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N1J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0I0Theta0N1J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0I0Theta0N1J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N1J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0I0Theta0N1J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0I0Theta0N1J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N1J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N1J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N1J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N1J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0I0Theta0N1J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0I0Theta0N1J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0I0Theta0N1J0_per_T1',
    interfaces: [Quan]
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0I0Theta0N1J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  var get_Katal = defineInlineFunction('output.info.kunalsheth.units.generated.get_Katal_rcaex3$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    var L0A0M0I0Theta0N1J0_per_T1_init = _.info.kunalsheth.units.generated.L0A0M0I0Theta0N1J0_per_T1;
    return function ($receiver) {
      return new L0A0M0I0Theta0N1J0_per_T1_init(numberToDouble($receiver) * 1.0);
    };
  }));
  var get_Katal_0 = defineInlineFunction('output.info.kunalsheth.units.generated.get_Katal_6vfmo$', function ($receiver) {
    return $receiver.siValue * 1.0;
  });
  function Katal() {
    Katal_instance = this;
    this.$delegate_v1hery$_0 = box(new L0A0M0I0Theta0N1J0_per_T1(1.0));
    this.unitName_olfe9b$_0 = 'Katal';
  }
  Object.defineProperty(Katal.prototype, 'unitName', {
    get: function () {
      return this.unitName_olfe9b$_0;
    }
  });
  Katal.prototype.invoke_14dthe$ = function (x) {
    return new L0A0M0I0Theta0N1J0_per_T1(numberToDouble(x) * 1.0);
  };
  Katal.prototype.invoke_j0rjbv$ = function (x) {
    return x.siValue * 1.0;
  };
  Object.defineProperty(Katal.prototype, 'abrev', {
    get: function () {
      return this.$delegate_v1hery$_0.abrev;
    }
  });
  Object.defineProperty(Katal.prototype, 'abs', {
    get: function () {
      return this.$delegate_v1hery$_0.abs;
    }
  });
  Object.defineProperty(Katal.prototype, 'isNegative', {
    get: function () {
      return this.$delegate_v1hery$_0.isNegative;
    }
  });
  Object.defineProperty(Katal.prototype, 'isPositive', {
    get: function () {
      return this.$delegate_v1hery$_0.isPositive;
    }
  });
  Object.defineProperty(Katal.prototype, 'isZero', {
    get: function () {
      return this.$delegate_v1hery$_0.isZero;
    }
  });
  Object.defineProperty(Katal.prototype, 'siValue', {
    get: function () {
      return this.$delegate_v1hery$_0.siValue;
    }
  });
  Object.defineProperty(Katal.prototype, 'signum', {
    get: function () {
      return this.$delegate_v1hery$_0.signum;
    }
  });
  Katal.prototype.compareTo_11rb$ = function (other) {
    return this.$delegate_v1hery$_0.compareTo_11rb$(other);
  };
  Katal.prototype.div_3p81yu$ = function (that) {
    return this.$delegate_v1hery$_0.div_3p81yu$(that);
  };
  Katal.prototype.max_j0rjbv$ = function (that) {
    return this.$delegate_v1hery$_0.max_j0rjbv$(that);
  };
  Katal.prototype.min_j0rjbv$ = function (that) {
    return this.$delegate_v1hery$_0.min_j0rjbv$(that);
  };
  Katal.prototype.minus_j0rjbv$ = function (that) {
    return this.$delegate_v1hery$_0.minus_j0rjbv$(that);
  };
  Katal.prototype.new_14dthe$ = function (siValue) {
    return this.$delegate_v1hery$_0.new_14dthe$(siValue);
  };
  Katal.prototype.plus_j0rjbv$ = function (that) {
    return this.$delegate_v1hery$_0.plus_j0rjbv$(that);
  };
  Katal.prototype.rem_j0rjbv$ = function (that) {
    return this.$delegate_v1hery$_0.rem_j0rjbv$(that);
  };
  Katal.prototype.times_3p81yu$ = function (that) {
    return this.$delegate_v1hery$_0.times_3p81yu$(that);
  };
  Katal.prototype.unaryMinus = function () {
    return this.$delegate_v1hery$_0.unaryMinus();
  };
  Katal.prototype.unaryPlus = function () {
    return this.$delegate_v1hery$_0.unaryPlus();
  };
  Katal.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Katal',
    interfaces: [Quan, UomConverter]
  };
  var Katal_instance = null;
  function Katal_getInstance() {
    if (Katal_instance === null) {
      new Katal();
    }
    return Katal_instance;
  }
  function L3A0M0T0I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L3A0M0T0I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'm\xB3';
    }
  });
  L3A0M0T0I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L3A0M0T0I0Theta0N0J0(siValue);
  };
  L3A0M0T0I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L3A0M0T0I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L3A0M0T0I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L3A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L3A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L3A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L3A0M0T0I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L3A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L3A0M0T0I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L3A0M0T0I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L3A0M0T0I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L3A0M0T0I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L3A0M0T0I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L3A0M0T0I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L3A0M0T0I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L3A0M0T0I0Theta0N0J0',
    interfaces: [Quan]
  };
  L3A0M0T0I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L3A0M0T0I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L3A0M0T0I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L3A0M0I0Theta0N0J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L3A0M0I0Theta0N0J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L3A0M0I0Theta0N0J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 'm\xB3\u22C5s\u207B\xB9';
    }
  });
  L3A0M0I0Theta0N0J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L3A0M0I0Theta0N0J0_per_T1(siValue);
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.unaryPlus = function () {
    return new L3A0M0I0Theta0N0J0_per_T1(+this.underlying_8be2vx$);
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.unaryMinus = function () {
    return new L3A0M0I0Theta0N0J0_per_T1(-this.underlying_8be2vx$);
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L3A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L3A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L3A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L3A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L3A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L3A0M0I0Theta0N0J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L3A0M0I0Theta0N0J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L3A0M0I0Theta0N0J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L3A0M0I0Theta0N0J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L3A0M0I0Theta0N0J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L3A0M0I0Theta0N0J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L3A0M0I0Theta0N0J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L3A0M0I0Theta0N0J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L3A0M0I0Theta0N0J0_per_T1',
    interfaces: [Quan]
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L3A0M0I0Theta0N0J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0M0I0Theta0N0J0_per_T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T3.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5s\u207B\xB3';
    }
  });
  L1A0M0I0Theta0N0J0_per_T3.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M0I0Theta0N0J0_per_T3(siValue);
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.unaryPlus = function () {
    return new L1A0M0I0Theta0N0J0_per_T3(+this.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.unaryMinus = function () {
    return new L1A0M0I0Theta0N0J0_per_T3(-this.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.times_3p81yu$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.div_3p81yu$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M0I0Theta0N0J0_per_T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M0I0Theta0N0J0_per_T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M0I0Theta0N0J0_per_T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M0I0Theta0N0J0_per_T3',
    interfaces: [Quan]
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M0I0Theta0N0J0_per_T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0M0I0Theta0N0J0_per_T4(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T4.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T4.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5s\u207B\u2074';
    }
  });
  L1A0M0I0Theta0N0J0_per_T4.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M0I0Theta0N0J0_per_T4(siValue);
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.unaryPlus = function () {
    return new L1A0M0I0Theta0N0J0_per_T4(+this.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.unaryMinus = function () {
    return new L1A0M0I0Theta0N0J0_per_T4(-this.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.times_3p81yu$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.div_3p81yu$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M0I0Theta0N0J0_per_T4(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T4.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M0I0Theta0N0J0_per_T4(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T4.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T4.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T4.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M0I0Theta0N0J0_per_T4.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M0I0Theta0N0J0_per_T4.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M0I0Theta0N0J0_per_T4.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M0I0Theta0N0J0_per_T4',
    interfaces: [Quan]
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M0I0Theta0N0J0_per_T4.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A1M0I0Theta0N0J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 'rad\u22C5s\u207B\xB9';
    }
  });
  L0A1M0I0Theta0N0J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L0A1M0I0Theta0N0J0_per_T1(siValue);
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.unaryPlus = function () {
    return new L0A1M0I0Theta0N0J0_per_T1(+this.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.unaryMinus = function () {
    return new L0A1M0I0Theta0N0J0_per_T1(-this.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A1M0I0Theta0N0J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A1M0I0Theta0N0J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A1M0I0Theta0N0J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A1M0I0Theta0N0J0_per_T1',
    interfaces: [Quan]
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A1M0I0Theta0N0J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A1M0I0Theta0N0J0_per_T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T2.prototype, 'abrev', {
    get: function () {
      return 'rad\u22C5s\u207B\xB2';
    }
  });
  L0A1M0I0Theta0N0J0_per_T2.prototype.new_14dthe$ = function (siValue) {
    return new L0A1M0I0Theta0N0J0_per_T2(siValue);
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.unaryPlus = function () {
    return new L0A1M0I0Theta0N0J0_per_T2(+this.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.unaryMinus = function () {
    return new L0A1M0I0Theta0N0J0_per_T2(-this.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.plus_j0rjbv$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.minus_j0rjbv$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.times_3p81yu$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.div_3p81yu$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.rem_j0rjbv$ = function (that) {
    return new L0A1M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A1M0I0Theta0N0J0_per_T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A1M0I0Theta0N0J0_per_T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A1M0I0Theta0N0J0_per_T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A1M0I0Theta0N0J0_per_T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A1M0I0Theta0N0J0_per_T2',
    interfaces: [Quan]
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A1M0I0Theta0N0J0_per_T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0M1I0Theta0N0J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5kg\u22C5s\u207B\xB9';
    }
  });
  L1A0M1I0Theta0N0J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M1I0Theta0N0J0_per_T1(siValue);
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.unaryPlus = function () {
    return new L1A0M1I0Theta0N0J0_per_T1(+this.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.unaryMinus = function () {
    return new L1A0M1I0Theta0N0J0_per_T1(-this.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M1I0Theta0N0J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M1I0Theta0N0J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M1I0Theta0N0J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M1I0Theta0N0J0_per_T1',
    interfaces: [Quan]
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M1I0Theta0N0J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2A0M1I0Theta0N0J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB9';
    }
  });
  L2A0M1I0Theta0N0J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1I0Theta0N0J0_per_T1(siValue);
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.unaryPlus = function () {
    return new L2A0M1I0Theta0N0J0_per_T1(+this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.unaryMinus = function () {
    return new L2A0M1I0Theta0N0J0_per_T1(-this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1I0Theta0N0J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0N0J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1I0Theta0N0J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1I0Theta0N0J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1I0Theta0N0J0_per_T1',
    interfaces: [Quan]
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1I0Theta0N0J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2M1I0Theta0N0J0_per_A1T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2M1I0Theta0N0J0_per_A1T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A1T2.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5rad\u207B\xB9\u22C5kg\u22C5s\u207B\xB2';
    }
  });
  L2M1I0Theta0N0J0_per_A1T2.prototype.new_14dthe$ = function (siValue) {
    return new L2M1I0Theta0N0J0_per_A1T2(siValue);
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.unaryPlus = function () {
    return new L2M1I0Theta0N0J0_per_A1T2(+this.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.unaryMinus = function () {
    return new L2M1I0Theta0N0J0_per_A1T2(-this.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.plus_j0rjbv$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A1T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.minus_j0rjbv$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A1T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.times_3p81yu$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A1T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.div_3p81yu$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A1T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.rem_j0rjbv$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A1T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2M1I0Theta0N0J0_per_A1T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2M1I0Theta0N0J0_per_A1T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A1T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A1T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A1T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A1T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2M1I0Theta0N0J0_per_A1T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2M1I0Theta0N0J0_per_A1T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2M1I0Theta0N0J0_per_A1T2',
    interfaces: [Quan]
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2M1I0Theta0N0J0_per_A1T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0M1I0Theta0N0J0_per_T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T3.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5kg\u22C5s\u207B\xB3';
    }
  });
  L1A0M1I0Theta0N0J0_per_T3.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M1I0Theta0N0J0_per_T3(siValue);
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.unaryPlus = function () {
    return new L1A0M1I0Theta0N0J0_per_T3(+this.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.unaryMinus = function () {
    return new L1A0M1I0Theta0N0J0_per_T3(-this.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.times_3p81yu$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.div_3p81yu$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M1I0Theta0N0J0_per_T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M1I0Theta0N0J0_per_T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M1I0Theta0N0J0_per_T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M1I0Theta0N0J0_per_T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M1I0Theta0N0J0_per_T3',
    interfaces: [Quan]
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M1I0Theta0N0J0_per_T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T0I0Theta0N0J0_per_L1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9';
    }
  });
  A0M0T0I0Theta0N0J0_per_L1.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T0I0Theta0N0J0_per_L1(siValue);
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.unaryPlus = function () {
    return new A0M0T0I0Theta0N0J0_per_L1(+this.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.unaryMinus = function () {
    return new A0M0T0I0Theta0N0J0_per_L1(-this.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.times_3p81yu$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.div_3p81yu$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T0I0Theta0N0J0_per_L1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T0I0Theta0N0J0_per_L1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T0I0Theta0N0J0_per_L1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T0I0Theta0N0J0_per_L1',
    interfaces: [Quan]
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T0I0Theta0N0J0_per_L1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M1T0I0Theta0N0J0_per_L2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L2.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5kg';
    }
  });
  A0M1T0I0Theta0N0J0_per_L2.prototype.new_14dthe$ = function (siValue) {
    return new A0M1T0I0Theta0N0J0_per_L2(siValue);
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.unaryPlus = function () {
    return new A0M1T0I0Theta0N0J0_per_L2(+this.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.unaryMinus = function () {
    return new A0M1T0I0Theta0N0J0_per_L2(-this.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.plus_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.minus_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.times_3p81yu$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.div_3p81yu$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.rem_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M1T0I0Theta0N0J0_per_L2(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M1T0I0Theta0N0J0_per_L2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M1T0I0Theta0N0J0_per_L2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M1T0I0Theta0N0J0_per_L2',
    interfaces: [Quan]
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M1T0I0Theta0N0J0_per_L2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M1T0I0Theta0N0J0_per_L3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L3.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB3\u22C5kg';
    }
  });
  A0M1T0I0Theta0N0J0_per_L3.prototype.new_14dthe$ = function (siValue) {
    return new A0M1T0I0Theta0N0J0_per_L3(siValue);
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.unaryPlus = function () {
    return new A0M1T0I0Theta0N0J0_per_L3(+this.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.unaryMinus = function () {
    return new A0M1T0I0Theta0N0J0_per_L3(-this.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.plus_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.minus_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.times_3p81yu$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.div_3p81yu$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.rem_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M1T0I0Theta0N0J0_per_L3(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M1T0I0Theta0N0J0_per_L3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M1T0I0Theta0N0J0_per_L3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M1T0I0Theta0N0J0_per_L3',
    interfaces: [Quan]
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M1T0I0Theta0N0J0_per_L3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L3A0T0I0Theta0N0J0_per_M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L3A0T0I0Theta0N0J0_per_M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L3A0T0I0Theta0N0J0_per_M1.prototype, 'abrev', {
    get: function () {
      return 'm\xB3\u22C5kg\u207B\xB9';
    }
  });
  L3A0T0I0Theta0N0J0_per_M1.prototype.new_14dthe$ = function (siValue) {
    return new L3A0T0I0Theta0N0J0_per_M1(siValue);
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.unaryPlus = function () {
    return new L3A0T0I0Theta0N0J0_per_M1(+this.underlying_8be2vx$);
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.unaryMinus = function () {
    return new L3A0T0I0Theta0N0J0_per_M1(-this.underlying_8be2vx$);
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.plus_j0rjbv$ = function (that) {
    return new L3A0T0I0Theta0N0J0_per_M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.minus_j0rjbv$ = function (that) {
    return new L3A0T0I0Theta0N0J0_per_M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.times_3p81yu$ = function (that) {
    return new L3A0T0I0Theta0N0J0_per_M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.div_3p81yu$ = function (that) {
    return new L3A0T0I0Theta0N0J0_per_M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.rem_j0rjbv$ = function (that) {
    return new L3A0T0I0Theta0N0J0_per_M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L3A0T0I0Theta0N0J0_per_M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L3A0T0I0Theta0N0J0_per_M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L3A0T0I0Theta0N0J0_per_M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L3A0T0I0Theta0N0J0_per_M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L3A0T0I0Theta0N0J0_per_M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L3A0T0I0Theta0N0J0_per_M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L3A0T0I0Theta0N0J0_per_M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L3A0T0I0Theta0N0J0_per_M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L3A0T0I0Theta0N0J0_per_M1',
    interfaces: [Quan]
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L3A0T0I0Theta0N0J0_per_M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T0I0Theta0N1J0_per_L3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T0I0Theta0N1J0_per_L3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N1J0_per_L3.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB3\u22C5mol';
    }
  });
  A0M0T0I0Theta0N1J0_per_L3.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T0I0Theta0N1J0_per_L3(siValue);
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.unaryPlus = function () {
    return new A0M0T0I0Theta0N1J0_per_L3(+this.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.unaryMinus = function () {
    return new A0M0T0I0Theta0N1J0_per_L3(-this.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N1J0_per_L3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N1J0_per_L3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.times_3p81yu$ = function (that) {
    return new A0M0T0I0Theta0N1J0_per_L3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.div_3p81yu$ = function (that) {
    return new A0M0T0I0Theta0N1J0_per_L3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N1J0_per_L3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T0I0Theta0N1J0_per_L3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T0I0Theta0N1J0_per_L3(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N1J0_per_L3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N1J0_per_L3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N1J0_per_L3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N1J0_per_L3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T0I0Theta0N1J0_per_L3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T0I0Theta0N1J0_per_L3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T0I0Theta0N1J0_per_L3',
    interfaces: [Quan]
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T0I0Theta0N1J0_per_L3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L3A0M0T0I0Theta0J0_per_N1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L3A0M0T0I0Theta0J0_per_N1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0J0_per_N1.prototype, 'abrev', {
    get: function () {
      return 'm\xB3\u22C5mol\u207B\xB9';
    }
  });
  L3A0M0T0I0Theta0J0_per_N1.prototype.new_14dthe$ = function (siValue) {
    return new L3A0M0T0I0Theta0J0_per_N1(siValue);
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.unaryPlus = function () {
    return new L3A0M0T0I0Theta0J0_per_N1(+this.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.unaryMinus = function () {
    return new L3A0M0T0I0Theta0J0_per_N1(-this.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.plus_j0rjbv$ = function (that) {
    return new L3A0M0T0I0Theta0J0_per_N1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.minus_j0rjbv$ = function (that) {
    return new L3A0M0T0I0Theta0J0_per_N1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.times_3p81yu$ = function (that) {
    return new L3A0M0T0I0Theta0J0_per_N1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.div_3p81yu$ = function (that) {
    return new L3A0M0T0I0Theta0J0_per_N1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.rem_j0rjbv$ = function (that) {
    return new L3A0M0T0I0Theta0J0_per_N1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L3A0M0T0I0Theta0J0_per_N1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L3A0M0T0I0Theta0J0_per_N1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0J0_per_N1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0J0_per_N1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0J0_per_N1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L3A0M0T0I0Theta0J0_per_N1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L3A0M0T0I0Theta0J0_per_N1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L3A0M0T0I0Theta0J0_per_N1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L3A0M0T0I0Theta0J0_per_N1',
    interfaces: [Quan]
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L3A0M0T0I0Theta0J0_per_N1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2A0M1I0N0J0_per_T2Theta1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1I0N0J0_per_T2Theta1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1I0N0J0_per_T2Theta1.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB2\u22C5K\u207B\xB9';
    }
  });
  L2A0M1I0N0J0_per_T2Theta1.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1I0N0J0_per_T2Theta1(siValue);
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.unaryPlus = function () {
    return new L2A0M1I0N0J0_per_T2Theta1(+this.underlying_8be2vx$);
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.unaryMinus = function () {
    return new L2A0M1I0N0J0_per_T2Theta1(-this.underlying_8be2vx$);
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1I0N0J0_per_T2Theta1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1I0N0J0_per_T2Theta1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1I0N0J0_per_T2Theta1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1I0N0J0_per_T2Theta1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1I0N0J0_per_T2Theta1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1I0N0J0_per_T2Theta1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1I0N0J0_per_T2Theta1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1I0N0J0_per_T2Theta1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1I0N0J0_per_T2Theta1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1I0N0J0_per_T2Theta1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1I0N0J0_per_T2Theta1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1I0N0J0_per_T2Theta1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1I0N0J0_per_T2Theta1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1I0N0J0_per_T2Theta1',
    interfaces: [Quan]
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1I0N0J0_per_T2Theta1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2A0M1I0J0_per_T2Theta1N1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1I0J0_per_T2Theta1N1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1I0J0_per_T2Theta1N1.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB2\u22C5K\u207B\xB9\u22C5mol\u207B\xB9';
    }
  });
  L2A0M1I0J0_per_T2Theta1N1.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1I0J0_per_T2Theta1N1(siValue);
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.unaryPlus = function () {
    return new L2A0M1I0J0_per_T2Theta1N1(+this.underlying_8be2vx$);
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.unaryMinus = function () {
    return new L2A0M1I0J0_per_T2Theta1N1(-this.underlying_8be2vx$);
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1I0J0_per_T2Theta1N1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1I0J0_per_T2Theta1N1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1I0J0_per_T2Theta1N1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1I0J0_per_T2Theta1N1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1I0J0_per_T2Theta1N1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1I0J0_per_T2Theta1N1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1I0J0_per_T2Theta1N1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1I0J0_per_T2Theta1N1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1I0J0_per_T2Theta1N1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1I0J0_per_T2Theta1N1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1I0J0_per_T2Theta1N1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1I0J0_per_T2Theta1N1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1I0J0_per_T2Theta1N1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1I0J0_per_T2Theta1N1',
    interfaces: [Quan]
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1I0J0_per_T2Theta1N1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2A0M0I0N0J0_per_T2Theta1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M0I0N0J0_per_T2Theta1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M0I0N0J0_per_T2Theta1.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5s\u207B\xB2\u22C5K\u207B\xB9';
    }
  });
  L2A0M0I0N0J0_per_T2Theta1.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M0I0N0J0_per_T2Theta1(siValue);
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.unaryPlus = function () {
    return new L2A0M0I0N0J0_per_T2Theta1(+this.underlying_8be2vx$);
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.unaryMinus = function () {
    return new L2A0M0I0N0J0_per_T2Theta1(-this.underlying_8be2vx$);
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M0I0N0J0_per_T2Theta1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M0I0N0J0_per_T2Theta1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.times_3p81yu$ = function (that) {
    return new L2A0M0I0N0J0_per_T2Theta1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.div_3p81yu$ = function (that) {
    return new L2A0M0I0N0J0_per_T2Theta1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M0I0N0J0_per_T2Theta1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M0I0N0J0_per_T2Theta1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M0I0N0J0_per_T2Theta1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M0I0N0J0_per_T2Theta1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M0I0N0J0_per_T2Theta1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M0I0N0J0_per_T2Theta1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M0I0N0J0_per_T2Theta1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M0I0N0J0_per_T2Theta1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M0I0N0J0_per_T2Theta1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M0I0N0J0_per_T2Theta1',
    interfaces: [Quan]
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M0I0N0J0_per_T2Theta1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2A0M1I0Theta0J0_per_T2N1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1I0Theta0J0_per_T2N1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0J0_per_T2N1.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg\u22C5s\u207B\xB2\u22C5mol\u207B\xB9';
    }
  });
  L2A0M1I0Theta0J0_per_T2N1.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1I0Theta0J0_per_T2N1(siValue);
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.unaryPlus = function () {
    return new L2A0M1I0Theta0J0_per_T2N1(+this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.unaryMinus = function () {
    return new L2A0M1I0Theta0J0_per_T2N1(-this.underlying_8be2vx$);
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0J0_per_T2N1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0J0_per_T2N1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0J0_per_T2N1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1I0Theta0J0_per_T2N1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1I0Theta0J0_per_T2N1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1I0Theta0J0_per_T2N1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1I0Theta0J0_per_T2N1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1I0Theta0J0_per_T2N1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1I0Theta0J0_per_T2N1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0J0_per_T2N1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1I0Theta0J0_per_T2N1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1I0Theta0J0_per_T2N1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1I0Theta0J0_per_T2N1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1I0Theta0J0_per_T2N1',
    interfaces: [Quan]
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1I0Theta0J0_per_T2N1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0M1I0Theta0N0J0_per_T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T2.prototype, 'abrev', {
    get: function () {
      return 'kg\u22C5s\u207B\xB2';
    }
  });
  L0A0M1I0Theta0N0J0_per_T2.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M1I0Theta0N0J0_per_T2(siValue);
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.unaryPlus = function () {
    return new L0A0M1I0Theta0N0J0_per_T2(+this.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.unaryMinus = function () {
    return new L0A0M1I0Theta0N0J0_per_T2(-this.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.times_3p81yu$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.div_3p81yu$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M1I0Theta0N0J0_per_T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M1I0Theta0N0J0_per_T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M1I0Theta0N0J0_per_T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M1I0Theta0N0J0_per_T2',
    interfaces: [Quan]
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M1I0Theta0N0J0_per_T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0M1I0Theta0N0J0_per_T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T3.prototype, 'abrev', {
    get: function () {
      return 'kg\u22C5s\u207B\xB3';
    }
  });
  L0A0M1I0Theta0N0J0_per_T3.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M1I0Theta0N0J0_per_T3(siValue);
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.unaryPlus = function () {
    return new L0A0M1I0Theta0N0J0_per_T3(+this.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.unaryMinus = function () {
    return new L0A0M1I0Theta0N0J0_per_T3(-this.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.times_3p81yu$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.div_3p81yu$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M1I0Theta0N0J0_per_T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M1I0Theta0N0J0_per_T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M1I0Theta0N0J0_per_T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M1I0Theta0N0J0_per_T3',
    interfaces: [Quan]
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M1I0Theta0N0J0_per_T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0M1I0N0J0_per_T3Theta1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M1I0N0J0_per_T3Theta1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M1I0N0J0_per_T3Theta1.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5kg\u22C5s\u207B\xB3\u22C5K\u207B\xB9';
    }
  });
  L1A0M1I0N0J0_per_T3Theta1.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M1I0N0J0_per_T3Theta1(siValue);
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.unaryPlus = function () {
    return new L1A0M1I0N0J0_per_T3Theta1(+this.underlying_8be2vx$);
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.unaryMinus = function () {
    return new L1A0M1I0N0J0_per_T3Theta1(-this.underlying_8be2vx$);
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M1I0N0J0_per_T3Theta1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M1I0N0J0_per_T3Theta1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.times_3p81yu$ = function (that) {
    return new L1A0M1I0N0J0_per_T3Theta1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.div_3p81yu$ = function (that) {
    return new L1A0M1I0N0J0_per_T3Theta1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M1I0N0J0_per_T3Theta1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M1I0N0J0_per_T3Theta1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M1I0N0J0_per_T3Theta1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M1I0N0J0_per_T3Theta1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M1I0N0J0_per_T3Theta1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M1I0N0J0_per_T3Theta1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M1I0N0J0_per_T3Theta1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M1I0N0J0_per_T3Theta1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M1I0N0J0_per_T3Theta1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M1I0N0J0_per_T3Theta1',
    interfaces: [Quan]
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M1I0N0J0_per_T3Theta1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2A0M0I0Theta0N0J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5s\u207B\xB9';
    }
  });
  L2A0M0I0Theta0N0J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M0I0Theta0N0J0_per_T1(siValue);
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.unaryPlus = function () {
    return new L2A0M0I0Theta0N0J0_per_T1(+this.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.unaryMinus = function () {
    return new L2A0M0I0Theta0N0J0_per_T1(-this.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M0I0Theta0N0J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M0I0Theta0N0J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M0I0Theta0N0J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M0I0Theta0N0J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M0I0Theta0N0J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M0I0Theta0N0J0_per_T1',
    interfaces: [Quan]
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M0I0Theta0N0J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M1I0Theta0N0J0_per_L1T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5kg\u22C5s\u207B\xB9';
    }
  });
  A0M1I0Theta0N0J0_per_L1T1.prototype.new_14dthe$ = function (siValue) {
    return new A0M1I0Theta0N0J0_per_L1T1(siValue);
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.unaryPlus = function () {
    return new A0M1I0Theta0N0J0_per_L1T1(+this.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.unaryMinus = function () {
    return new A0M1I0Theta0N0J0_per_L1T1(-this.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.plus_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.minus_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.times_3p81yu$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.div_3p81yu$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.rem_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M1I0Theta0N0J0_per_L1T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M1I0Theta0N0J0_per_L1T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M1I0Theta0N0J0_per_L1T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M1I0Theta0N0J0_per_L1T1',
    interfaces: [Quan]
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M1I0Theta0N0J0_per_L1T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T1I1Theta0N0J0_per_L2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L2.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5s\u22C5A';
    }
  });
  A0M0T1I1Theta0N0J0_per_L2.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T1I1Theta0N0J0_per_L2(siValue);
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.unaryPlus = function () {
    return new A0M0T1I1Theta0N0J0_per_L2(+this.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.unaryMinus = function () {
    return new A0M0T1I1Theta0N0J0_per_L2(-this.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.times_3p81yu$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.div_3p81yu$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T1I1Theta0N0J0_per_L2(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T1I1Theta0N0J0_per_L2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T1I1Theta0N0J0_per_L2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T1I1Theta0N0J0_per_L2',
    interfaces: [Quan]
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T1I1Theta0N0J0_per_L2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T1I1Theta0N0J0_per_L3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L3.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB3\u22C5s\u22C5A';
    }
  });
  A0M0T1I1Theta0N0J0_per_L3.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T1I1Theta0N0J0_per_L3(siValue);
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.unaryPlus = function () {
    return new A0M0T1I1Theta0N0J0_per_L3(+this.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.unaryMinus = function () {
    return new A0M0T1I1Theta0N0J0_per_L3(-this.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.times_3p81yu$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.div_3p81yu$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T1I1Theta0N0J0_per_L3(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T1I1Theta0N0J0_per_L3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T1I1Theta0N0J0_per_L3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T1I1Theta0N0J0_per_L3',
    interfaces: [Quan]
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T1I1Theta0N0J0_per_L3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T0I1Theta0N0J0_per_L2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L2.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5A';
    }
  });
  A0M0T0I1Theta0N0J0_per_L2.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T0I1Theta0N0J0_per_L2(siValue);
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.unaryPlus = function () {
    return new A0M0T0I1Theta0N0J0_per_L2(+this.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.unaryMinus = function () {
    return new A0M0T0I1Theta0N0J0_per_L2(-this.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.times_3p81yu$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.div_3p81yu$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T0I1Theta0N0J0_per_L2(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T0I1Theta0N0J0_per_L2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T0I1Theta0N0J0_per_L2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T0I1Theta0N0J0_per_L2',
    interfaces: [Quan]
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T0I1Theta0N0J0_per_L2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0T3I2Theta0N0J0_per_L3M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T3I2Theta0N0J0_per_L3M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L3M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB3\u22C5kg\u207B\xB9\u22C5s\xB3\u22C5A\xB2';
    }
  });
  A0T3I2Theta0N0J0_per_L3M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T3I2Theta0N0J0_per_L3M1(siValue);
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.unaryPlus = function () {
    return new A0T3I2Theta0N0J0_per_L3M1(+this.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.unaryMinus = function () {
    return new A0T3I2Theta0N0J0_per_L3M1(-this.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.times_3p81yu$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.div_3p81yu$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T3I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T3I2Theta0N0J0_per_L3M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T3I2Theta0N0J0_per_L3M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L3M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L3M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L3M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T3I2Theta0N0J0_per_L3M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T3I2Theta0N0J0_per_L3M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T3I2Theta0N0J0_per_L3M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T3I2Theta0N0J0_per_L3M1',
    interfaces: [Quan]
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T3I2Theta0N0J0_per_L3M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0T3I2Theta0J0_per_M1N1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0T3I2Theta0J0_per_M1N1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0T3I2Theta0J0_per_M1N1.prototype, 'abrev', {
    get: function () {
      return 'kg\u207B\xB9\u22C5s\xB3\u22C5A\xB2\u22C5mol\u207B\xB9';
    }
  });
  L0A0T3I2Theta0J0_per_M1N1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0T3I2Theta0J0_per_M1N1(siValue);
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.unaryPlus = function () {
    return new L0A0T3I2Theta0J0_per_M1N1(+this.underlying_8be2vx$);
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.unaryMinus = function () {
    return new L0A0T3I2Theta0J0_per_M1N1(-this.underlying_8be2vx$);
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0T3I2Theta0J0_per_M1N1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0T3I2Theta0J0_per_M1N1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.times_3p81yu$ = function (that) {
    return new L0A0T3I2Theta0J0_per_M1N1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.div_3p81yu$ = function (that) {
    return new L0A0T3I2Theta0J0_per_M1N1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0T3I2Theta0J0_per_M1N1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0T3I2Theta0J0_per_M1N1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0T3I2Theta0J0_per_M1N1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0T3I2Theta0J0_per_M1N1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0T3I2Theta0J0_per_M1N1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0T3I2Theta0J0_per_M1N1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0T3I2Theta0J0_per_M1N1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0T3I2Theta0J0_per_M1N1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0T3I2Theta0J0_per_M1N1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0T3I2Theta0J0_per_M1N1',
    interfaces: [Quan]
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0T3I2Theta0J0_per_M1N1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0T4I2Theta0N0J0_per_L3M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T4I2Theta0N0J0_per_L3M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L3M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB3\u22C5kg\u207B\xB9\u22C5s\u2074\u22C5A\xB2';
    }
  });
  A0T4I2Theta0N0J0_per_L3M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T4I2Theta0N0J0_per_L3M1(siValue);
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.unaryPlus = function () {
    return new A0T4I2Theta0N0J0_per_L3M1(+this.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.unaryMinus = function () {
    return new A0T4I2Theta0N0J0_per_L3M1(-this.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.times_3p81yu$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.div_3p81yu$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T4I2Theta0N0J0_per_L3M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T4I2Theta0N0J0_per_L3M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T4I2Theta0N0J0_per_L3M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L3M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L3M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L3M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T4I2Theta0N0J0_per_L3M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T4I2Theta0N0J0_per_L3M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T4I2Theta0N0J0_per_L3M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T4I2Theta0N0J0_per_L3M1',
    interfaces: [Quan]
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T4I2Theta0N0J0_per_L3M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0M1Theta0N0J0_per_T2I2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I2.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5kg\u22C5s\u207B\xB2\u22C5A\u207B\xB2';
    }
  });
  L1A0M1Theta0N0J0_per_T2I2.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M1Theta0N0J0_per_T2I2(siValue);
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.unaryPlus = function () {
    return new L1A0M1Theta0N0J0_per_T2I2(+this.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.unaryMinus = function () {
    return new L1A0M1Theta0N0J0_per_T2I2(-this.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.times_3p81yu$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.div_3p81yu$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M1Theta0N0J0_per_T2I2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M1Theta0N0J0_per_T2I2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M1Theta0N0J0_per_T2I2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M1Theta0N0J0_per_T2I2',
    interfaces: [Quan]
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M1Theta0N0J0_per_T2I2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0M1Theta0N0J0_per_T3I1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M1Theta0N0J0_per_T3I1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T3I1.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5kg\u22C5s\u207B\xB3\u22C5A\u207B\xB9';
    }
  });
  L1A0M1Theta0N0J0_per_T3I1.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M1Theta0N0J0_per_T3I1(siValue);
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.unaryPlus = function () {
    return new L1A0M1Theta0N0J0_per_T3I1(+this.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.unaryMinus = function () {
    return new L1A0M1Theta0N0J0_per_T3I1(-this.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.times_3p81yu$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.div_3p81yu$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T3I1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M1Theta0N0J0_per_T3I1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M1Theta0N0J0_per_T3I1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T3I1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T3I1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T3I1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T3I1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M1Theta0N0J0_per_T3I1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M1Theta0N0J0_per_T3I1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M1Theta0N0J0_per_T3I1',
    interfaces: [Quan]
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M1Theta0N0J0_per_T3I1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T0I1Theta0N0J0_per_L1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5A';
    }
  });
  A0M0T0I1Theta0N0J0_per_L1.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T0I1Theta0N0J0_per_L1(siValue);
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.unaryPlus = function () {
    return new A0M0T0I1Theta0N0J0_per_L1(+this.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.unaryMinus = function () {
    return new A0M0T0I1Theta0N0J0_per_L1(-this.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.times_3p81yu$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.div_3p81yu$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T0I1Theta0N0J0_per_L1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T0I1Theta0N0J0_per_L1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T0I1Theta0N0J0_per_L1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T0I1Theta0N0J0_per_L1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T0I1Theta0N0J0_per_L1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T0I1Theta0N0J0_per_L1',
    interfaces: [Quan]
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T0I1Theta0N0J0_per_L1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0M0T1I0Theta0N0J1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T1I0Theta0N0J1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J1.prototype, 'abrev', {
    get: function () {
      return 's\u22C5cd';
    }
  });
  L0A0M0T1I0Theta0N0J1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T1I0Theta0N0J1(siValue);
  };
  L0A0M0T1I0Theta0N0J1.prototype.unaryPlus = function () {
    return new L0A0M0T1I0Theta0N0J1(+this.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J1.prototype.unaryMinus = function () {
    return new L0A0M0T1I0Theta0N0J1(-this.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T1I0Theta0N0J1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T1I0Theta0N0J1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J1.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T1I0Theta0N0J1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T1I0Theta0N0J1.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T1I0Theta0N0J1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T1I0Theta0N0J1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T1I0Theta0N0J1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T1I0Theta0N0J1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T1I0Theta0N0J1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T1I0Theta0N0J1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T1I0Theta0N0J1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T1I0Theta0N0J1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T1I0Theta0N0J1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T1I0Theta0N0J1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T1I0Theta0N0J1',
    interfaces: [Quan]
  };
  L0A0M0T1I0Theta0N0J1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T1I0Theta0N0J1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T1I0Theta0N0J1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T1I0Theta0N0J1_per_L2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T1I0Theta0N0J1_per_L2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J1_per_L2.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5s\u22C5cd';
    }
  });
  A0M0T1I0Theta0N0J1_per_L2.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T1I0Theta0N0J1_per_L2(siValue);
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.unaryPlus = function () {
    return new A0M0T1I0Theta0N0J1_per_L2(+this.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.unaryMinus = function () {
    return new A0M0T1I0Theta0N0J1_per_L2(-this.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T1I0Theta0N0J1_per_L2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T1I0Theta0N0J1_per_L2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.times_3p81yu$ = function (that) {
    return new A0M0T1I0Theta0N0J1_per_L2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.div_3p81yu$ = function (that) {
    return new A0M0T1I0Theta0N0J1_per_L2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T1I0Theta0N0J1_per_L2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T1I0Theta0N0J1_per_L2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T1I0Theta0N0J1_per_L2(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J1_per_L2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J1_per_L2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J1_per_L2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T1I0Theta0N0J1_per_L2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T1I0Theta0N0J1_per_L2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T1I0Theta0N0J1_per_L2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T1I0Theta0N0J1_per_L2',
    interfaces: [Quan]
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T1I0Theta0N0J1_per_L2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0T1I1Theta0N0J0_per_M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0T1I1Theta0N0J0_per_M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0T1I1Theta0N0J0_per_M1.prototype, 'abrev', {
    get: function () {
      return 'kg\u207B\xB9\u22C5s\u22C5A';
    }
  });
  L0A0T1I1Theta0N0J0_per_M1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0T1I1Theta0N0J0_per_M1(siValue);
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.unaryPlus = function () {
    return new L0A0T1I1Theta0N0J0_per_M1(+this.underlying_8be2vx$);
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.unaryMinus = function () {
    return new L0A0T1I1Theta0N0J0_per_M1(-this.underlying_8be2vx$);
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0T1I1Theta0N0J0_per_M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0T1I1Theta0N0J0_per_M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.times_3p81yu$ = function (that) {
    return new L0A0T1I1Theta0N0J0_per_M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.div_3p81yu$ = function (that) {
    return new L0A0T1I1Theta0N0J0_per_M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0T1I1Theta0N0J0_per_M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0T1I1Theta0N0J0_per_M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0T1I1Theta0N0J0_per_M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0T1I1Theta0N0J0_per_M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0T1I1Theta0N0J0_per_M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0T1I1Theta0N0J0_per_M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0T1I1Theta0N0J0_per_M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0T1I1Theta0N0J0_per_M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0T1I1Theta0N0J0_per_M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0T1I1Theta0N0J0_per_M1',
    interfaces: [Quan]
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0T1I1Theta0N0J0_per_M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L3A0M1Theta0N0J0_per_T3I2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L3A0M1Theta0N0J0_per_T3I2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T3I2.prototype, 'abrev', {
    get: function () {
      return 'm\xB3\u22C5kg\u22C5s\u207B\xB3\u22C5A\u207B\xB2';
    }
  });
  L3A0M1Theta0N0J0_per_T3I2.prototype.new_14dthe$ = function (siValue) {
    return new L3A0M1Theta0N0J0_per_T3I2(siValue);
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.unaryPlus = function () {
    return new L3A0M1Theta0N0J0_per_T3I2(+this.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.unaryMinus = function () {
    return new L3A0M1Theta0N0J0_per_T3I2(-this.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.plus_j0rjbv$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.minus_j0rjbv$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.times_3p81yu$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.div_3p81yu$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.rem_j0rjbv$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T3I2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L3A0M1Theta0N0J0_per_T3I2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L3A0M1Theta0N0J0_per_T3I2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T3I2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T3I2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T3I2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T3I2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L3A0M1Theta0N0J0_per_T3I2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L3A0M1Theta0N0J0_per_T3I2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L3A0M1Theta0N0J0_per_T3I2',
    interfaces: [Quan]
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L3A0M1Theta0N0J0_per_T3I2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M1T0I0Theta0N0J0_per_L1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5kg';
    }
  });
  A0M1T0I0Theta0N0J0_per_L1.prototype.new_14dthe$ = function (siValue) {
    return new A0M1T0I0Theta0N0J0_per_L1(siValue);
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.unaryPlus = function () {
    return new A0M1T0I0Theta0N0J0_per_L1(+this.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.unaryMinus = function () {
    return new A0M1T0I0Theta0N0J0_per_L1(-this.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.plus_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.minus_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.times_3p81yu$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.div_3p81yu$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.rem_j0rjbv$ = function (that) {
    return new A0M1T0I0Theta0N0J0_per_L1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M1T0I0Theta0N0J0_per_L1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M1T0I0Theta0N0J0_per_L1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M1T0I0Theta0N0J0_per_L1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M1T0I0Theta0N0J0_per_L1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M1T0I0Theta0N0J0_per_L1',
    interfaces: [Quan]
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M1T0I0Theta0N0J0_per_L1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T1I1Theta0N0J0_per_L1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5s\u22C5A';
    }
  });
  A0M0T1I1Theta0N0J0_per_L1.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T1I1Theta0N0J0_per_L1(siValue);
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.unaryPlus = function () {
    return new A0M0T1I1Theta0N0J0_per_L1(+this.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.unaryMinus = function () {
    return new A0M0T1I1Theta0N0J0_per_L1(-this.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.times_3p81yu$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.div_3p81yu$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T1I1Theta0N0J0_per_L1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T1I1Theta0N0J0_per_L1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T1I1Theta0N0J0_per_L1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T1I1Theta0N0J0_per_L1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T1I1Theta0N0J0_per_L1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T1I1Theta0N0J0_per_L1',
    interfaces: [Quan]
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T1I1Theta0N0J0_per_L1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0T0I0Theta0N1J0_per_M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0T0I0Theta0N1J0_per_M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0T0I0Theta0N1J0_per_M1.prototype, 'abrev', {
    get: function () {
      return 'kg\u207B\xB9\u22C5mol';
    }
  });
  L0A0T0I0Theta0N1J0_per_M1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0T0I0Theta0N1J0_per_M1(siValue);
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.unaryPlus = function () {
    return new L0A0T0I0Theta0N1J0_per_M1(+this.underlying_8be2vx$);
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.unaryMinus = function () {
    return new L0A0T0I0Theta0N1J0_per_M1(-this.underlying_8be2vx$);
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0T0I0Theta0N1J0_per_M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0T0I0Theta0N1J0_per_M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.times_3p81yu$ = function (that) {
    return new L0A0T0I0Theta0N1J0_per_M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.div_3p81yu$ = function (that) {
    return new L0A0T0I0Theta0N1J0_per_M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0T0I0Theta0N1J0_per_M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0T0I0Theta0N1J0_per_M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0T0I0Theta0N1J0_per_M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0T0I0Theta0N1J0_per_M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0T0I0Theta0N1J0_per_M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0T0I0Theta0N1J0_per_M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0T0I0Theta0N1J0_per_M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0T0I0Theta0N1J0_per_M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0T0I0Theta0N1J0_per_M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0T0I0Theta0N1J0_per_M1',
    interfaces: [Quan]
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0T0I0Theta0N1J0_per_M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0M1T0I0Theta0J0_per_N1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M1T0I0Theta0J0_per_N1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0J0_per_N1.prototype, 'abrev', {
    get: function () {
      return 'kg\u22C5mol\u207B\xB9';
    }
  });
  L0A0M1T0I0Theta0J0_per_N1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M1T0I0Theta0J0_per_N1(siValue);
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.unaryPlus = function () {
    return new L0A0M1T0I0Theta0J0_per_N1(+this.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.unaryMinus = function () {
    return new L0A0M1T0I0Theta0J0_per_N1(-this.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M1T0I0Theta0J0_per_N1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M1T0I0Theta0J0_per_N1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.times_3p81yu$ = function (that) {
    return new L0A0M1T0I0Theta0J0_per_N1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.div_3p81yu$ = function (that) {
    return new L0A0M1T0I0Theta0J0_per_N1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M1T0I0Theta0J0_per_N1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M1T0I0Theta0J0_per_N1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M1T0I0Theta0J0_per_N1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0J0_per_N1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0J0_per_N1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0J0_per_N1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M1T0I0Theta0J0_per_N1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M1T0I0Theta0J0_per_N1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M1T0I0Theta0J0_per_N1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M1T0I0Theta0J0_per_N1',
    interfaces: [Quan]
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M1T0I0Theta0J0_per_N1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T0I0Theta0N0J0_per_L2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L2.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2';
    }
  });
  A0M0T0I0Theta0N0J0_per_L2.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T0I0Theta0N0J0_per_L2(siValue);
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.unaryPlus = function () {
    return new A0M0T0I0Theta0N0J0_per_L2(+this.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.unaryMinus = function () {
    return new A0M0T0I0Theta0N0J0_per_L2(-this.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.times_3p81yu$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.div_3p81yu$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta0N0J0_per_L2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T0I0Theta0N0J0_per_L2(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta0N0J0_per_L2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T0I0Theta0N0J0_per_L2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T0I0Theta0N0J0_per_L2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T0I0Theta0N0J0_per_L2',
    interfaces: [Quan]
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T0I0Theta0N0J0_per_L2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0M1I0Theta0N0J0_per_T1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T1.prototype, 'abrev', {
    get: function () {
      return 'kg\u22C5s\u207B\xB9';
    }
  });
  L0A0M1I0Theta0N0J0_per_T1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M1I0Theta0N0J0_per_T1(siValue);
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.unaryPlus = function () {
    return new L0A0M1I0Theta0N0J0_per_T1(+this.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.unaryMinus = function () {
    return new L0A0M1I0Theta0N0J0_per_T1(-this.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.times_3p81yu$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.div_3p81yu$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M1I0Theta0N0J0_per_T1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M1I0Theta0N0J0_per_T1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M1I0Theta0N0J0_per_T1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M1I0Theta0N0J0_per_T1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M1I0Theta0N0J0_per_T1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M1I0Theta0N0J0_per_T1',
    interfaces: [Quan]
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M1I0Theta0N0J0_per_T1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2A0M0T0I1Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M0T0I1Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M0T0I1Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5A';
    }
  });
  L2A0M0T0I1Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M0T0I1Theta0N0J0(siValue);
  };
  L2A0M0T0I1Theta0N0J0.prototype.unaryPlus = function () {
    return new L2A0M0T0I1Theta0N0J0(+this.underlying_8be2vx$);
  };
  L2A0M0T0I1Theta0N0J0.prototype.unaryMinus = function () {
    return new L2A0M0T0I1Theta0N0J0(-this.underlying_8be2vx$);
  };
  L2A0M0T0I1Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M0T0I1Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M0T0I1Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L2A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M0T0I1Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L2A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M0T0I1Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M0T0I1Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M0T0I1Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M0T0I1Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M0T0I1Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M0T0I1Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M0T0I1Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M0T0I1Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M0T0I1Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M0T0I1Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M0T0I1Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M0T0I1Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M0T0I1Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M0T0I1Theta0N0J0',
    interfaces: [Quan]
  };
  L2A0M0T0I1Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M0T0I1Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M0T0I1Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M1I0Theta0N0J0_per_L1T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T3.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5kg\u22C5s\u207B\xB3';
    }
  });
  A0M1I0Theta0N0J0_per_L1T3.prototype.new_14dthe$ = function (siValue) {
    return new A0M1I0Theta0N0J0_per_L1T3(siValue);
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.unaryPlus = function () {
    return new A0M1I0Theta0N0J0_per_L1T3(+this.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.unaryMinus = function () {
    return new A0M1I0Theta0N0J0_per_L1T3(-this.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.plus_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.minus_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.times_3p81yu$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.div_3p81yu$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.rem_j0rjbv$ = function (that) {
    return new A0M1I0Theta0N0J0_per_L1T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M1I0Theta0N0J0_per_L1T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M1I0Theta0N0J0_per_L1T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M1I0Theta0N0J0_per_L1T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M1I0Theta0N0J0_per_L1T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M1I0Theta0N0J0_per_L1T3',
    interfaces: [Quan]
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M1I0Theta0N0J0_per_L1T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0T3I0Theta1N0J0_per_L2M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T3I0Theta1N0J0_per_L2M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T3I0Theta1N0J0_per_L2M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5kg\u207B\xB9\u22C5s\xB3\u22C5K';
    }
  });
  A0T3I0Theta1N0J0_per_L2M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T3I0Theta1N0J0_per_L2M1(siValue);
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.unaryPlus = function () {
    return new A0T3I0Theta1N0J0_per_L2M1(+this.underlying_8be2vx$);
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.unaryMinus = function () {
    return new A0T3I0Theta1N0J0_per_L2M1(-this.underlying_8be2vx$);
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T3I0Theta1N0J0_per_L2M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T3I0Theta1N0J0_per_L2M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.times_3p81yu$ = function (that) {
    return new A0T3I0Theta1N0J0_per_L2M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.div_3p81yu$ = function (that) {
    return new A0T3I0Theta1N0J0_per_L2M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T3I0Theta1N0J0_per_L2M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T3I0Theta1N0J0_per_L2M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T3I0Theta1N0J0_per_L2M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T3I0Theta1N0J0_per_L2M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T3I0Theta1N0J0_per_L2M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T3I0Theta1N0J0_per_L2M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T3I0Theta1N0J0_per_L2M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T3I0Theta1N0J0_per_L2M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T3I0Theta1N0J0_per_L2M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T3I0Theta1N0J0_per_L2M1',
    interfaces: [Quan]
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T3I0Theta1N0J0_per_L2M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0M0T0I0N0J0_per_Theta1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0T0I0N0J0_per_Theta1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0T0I0N0J0_per_Theta1.prototype, 'abrev', {
    get: function () {
      return 'K\u207B\xB9';
    }
  });
  L0A0M0T0I0N0J0_per_Theta1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0T0I0N0J0_per_Theta1(siValue);
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.unaryPlus = function () {
    return new L0A0M0T0I0N0J0_per_Theta1(+this.underlying_8be2vx$);
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.unaryMinus = function () {
    return new L0A0M0T0I0N0J0_per_Theta1(-this.underlying_8be2vx$);
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0N0J0_per_Theta1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0T0I0N0J0_per_Theta1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0T0I0N0J0_per_Theta1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0T0I0N0J0_per_Theta1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0T0I0N0J0_per_Theta1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0T0I0N0J0_per_Theta1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0T0I0N0J0_per_Theta1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0T0I0N0J0_per_Theta1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0T0I0N0J0_per_Theta1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0T0I0N0J0_per_Theta1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0T0I0N0J0_per_Theta1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0T0I0N0J0_per_Theta1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0T0I0N0J0_per_Theta1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0T0I0N0J0_per_Theta1',
    interfaces: [Quan]
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0T0I0N0J0_per_Theta1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0M0T0I0Theta1N0J0_per_L1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0M0T0I0Theta1N0J0_per_L1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0M0T0I0Theta1N0J0_per_L1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5K';
    }
  });
  A0M0T0I0Theta1N0J0_per_L1.prototype.new_14dthe$ = function (siValue) {
    return new A0M0T0I0Theta1N0J0_per_L1(siValue);
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.unaryPlus = function () {
    return new A0M0T0I0Theta1N0J0_per_L1(+this.underlying_8be2vx$);
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.unaryMinus = function () {
    return new A0M0T0I0Theta1N0J0_per_L1(-this.underlying_8be2vx$);
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.plus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta1N0J0_per_L1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.minus_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta1N0J0_per_L1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.times_3p81yu$ = function (that) {
    return new A0M0T0I0Theta1N0J0_per_L1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.div_3p81yu$ = function (that) {
    return new A0M0T0I0Theta1N0J0_per_L1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.rem_j0rjbv$ = function (that) {
    return new A0M0T0I0Theta1N0J0_per_L1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0M0T0I0Theta1N0J0_per_L1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0M0T0I0Theta1N0J0_per_L1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0M0T0I0Theta1N0J0_per_L1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0M0T0I0Theta1N0J0_per_L1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta1N0J0_per_L1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0M0T0I0Theta1N0J0_per_L1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0M0T0I0Theta1N0J0_per_L1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0M0T0I0Theta1N0J0_per_L1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0M0T0I0Theta1N0J0_per_L1',
    interfaces: [Quan]
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0M0T0I0Theta1N0J0_per_L1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0T2I1Theta0N0J0_per_M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0T2I1Theta0N0J0_per_M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0T2I1Theta0N0J0_per_M1.prototype, 'abrev', {
    get: function () {
      return 'kg\u207B\xB9\u22C5s\xB2\u22C5A';
    }
  });
  L0A0T2I1Theta0N0J0_per_M1.prototype.new_14dthe$ = function (siValue) {
    return new L0A0T2I1Theta0N0J0_per_M1(siValue);
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.unaryPlus = function () {
    return new L0A0T2I1Theta0N0J0_per_M1(+this.underlying_8be2vx$);
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.unaryMinus = function () {
    return new L0A0T2I1Theta0N0J0_per_M1(-this.underlying_8be2vx$);
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0T2I1Theta0N0J0_per_M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0T2I1Theta0N0J0_per_M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.times_3p81yu$ = function (that) {
    return new L0A0T2I1Theta0N0J0_per_M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.div_3p81yu$ = function (that) {
    return new L0A0T2I1Theta0N0J0_per_M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0T2I1Theta0N0J0_per_M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0T2I1Theta0N0J0_per_M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0T2I1Theta0N0J0_per_M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0T2I1Theta0N0J0_per_M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0T2I1Theta0N0J0_per_M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0T2I1Theta0N0J0_per_M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0T2I1Theta0N0J0_per_M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0T2I1Theta0N0J0_per_M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0T2I1Theta0N0J0_per_M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0T2I1Theta0N0J0_per_M1',
    interfaces: [Quan]
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0T2I1Theta0N0J0_per_M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0T2I0Theta0N0J0_per_M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0T2I0Theta0N0J0_per_M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0T2I0Theta0N0J0_per_M1.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5kg\u207B\xB9\u22C5s\xB2';
    }
  });
  L1A0T2I0Theta0N0J0_per_M1.prototype.new_14dthe$ = function (siValue) {
    return new L1A0T2I0Theta0N0J0_per_M1(siValue);
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.unaryPlus = function () {
    return new L1A0T2I0Theta0N0J0_per_M1(+this.underlying_8be2vx$);
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.unaryMinus = function () {
    return new L1A0T2I0Theta0N0J0_per_M1(-this.underlying_8be2vx$);
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0T2I0Theta0N0J0_per_M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0T2I0Theta0N0J0_per_M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.times_3p81yu$ = function (that) {
    return new L1A0T2I0Theta0N0J0_per_M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.div_3p81yu$ = function (that) {
    return new L1A0T2I0Theta0N0J0_per_M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0T2I0Theta0N0J0_per_M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0T2I0Theta0N0J0_per_M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0T2I0Theta0N0J0_per_M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0T2I0Theta0N0J0_per_M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0T2I0Theta0N0J0_per_M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0T2I0Theta0N0J0_per_M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0T2I0Theta0N0J0_per_M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0T2I0Theta0N0J0_per_M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0T2I0Theta0N0J0_per_M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0T2I0Theta0N0J0_per_M1',
    interfaces: [Quan]
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0T2I0Theta0N0J0_per_M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0T2I2Theta0N0J0_per_L2M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T2I2Theta0N0J0_per_L2M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L2M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5kg\u207B\xB9\u22C5s\xB2\u22C5A\xB2';
    }
  });
  A0T2I2Theta0N0J0_per_L2M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T2I2Theta0N0J0_per_L2M1(siValue);
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.unaryPlus = function () {
    return new A0T2I2Theta0N0J0_per_L2M1(+this.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.unaryMinus = function () {
    return new A0T2I2Theta0N0J0_per_L2M1(-this.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.times_3p81yu$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.div_3p81yu$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L2M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T2I2Theta0N0J0_per_L2M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T2I2Theta0N0J0_per_L2M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L2M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L2M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L2M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L2M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T2I2Theta0N0J0_per_L2M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T2I2Theta0N0J0_per_L2M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T2I2Theta0N0J0_per_L2M1',
    interfaces: [Quan]
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T2I2Theta0N0J0_per_L2M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1A0M1Theta0N0J0_per_T2I1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I1.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5kg\u22C5s\u207B\xB2\u22C5A\u207B\xB9';
    }
  });
  L1A0M1Theta0N0J0_per_T2I1.prototype.new_14dthe$ = function (siValue) {
    return new L1A0M1Theta0N0J0_per_T2I1(siValue);
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.unaryPlus = function () {
    return new L1A0M1Theta0N0J0_per_T2I1(+this.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.unaryMinus = function () {
    return new L1A0M1Theta0N0J0_per_T2I1(-this.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.plus_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.minus_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.times_3p81yu$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.div_3p81yu$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.rem_j0rjbv$ = function (that) {
    return new L1A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1A0M1Theta0N0J0_per_T2I1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1A0M1Theta0N0J0_per_T2I1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1A0M1Theta0N0J0_per_T2I1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1A0M1Theta0N0J0_per_T2I1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1A0M1Theta0N0J0_per_T2I1',
    interfaces: [Quan]
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1A0M1Theta0N0J0_per_T2I1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L3A0M1Theta0N0J0_per_T2I1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L3A0M1Theta0N0J0_per_T2I1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T2I1.prototype, 'abrev', {
    get: function () {
      return 'm\xB3\u22C5kg\u22C5s\u207B\xB2\u22C5A\u207B\xB9';
    }
  });
  L3A0M1Theta0N0J0_per_T2I1.prototype.new_14dthe$ = function (siValue) {
    return new L3A0M1Theta0N0J0_per_T2I1(siValue);
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.unaryPlus = function () {
    return new L3A0M1Theta0N0J0_per_T2I1(+this.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.unaryMinus = function () {
    return new L3A0M1Theta0N0J0_per_T2I1(-this.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.plus_j0rjbv$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.minus_j0rjbv$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.times_3p81yu$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.div_3p81yu$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.rem_j0rjbv$ = function (that) {
    return new L3A0M1Theta0N0J0_per_T2I1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L3A0M1Theta0N0J0_per_T2I1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L3A0M1Theta0N0J0_per_T2I1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T2I1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T2I1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T2I1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L3A0M1Theta0N0J0_per_T2I1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L3A0M1Theta0N0J0_per_T2I1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L3A0M1Theta0N0J0_per_T2I1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L3A0M1Theta0N0J0_per_T2I1',
    interfaces: [Quan]
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L3A0M1Theta0N0J0_per_T2I1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L3A0M0I0Theta0J0_per_T1N1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L3A0M0I0Theta0J0_per_T1N1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L3A0M0I0Theta0J0_per_T1N1.prototype, 'abrev', {
    get: function () {
      return 'm\xB3\u22C5s\u207B\xB9\u22C5mol\u207B\xB9';
    }
  });
  L3A0M0I0Theta0J0_per_T1N1.prototype.new_14dthe$ = function (siValue) {
    return new L3A0M0I0Theta0J0_per_T1N1(siValue);
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.unaryPlus = function () {
    return new L3A0M0I0Theta0J0_per_T1N1(+this.underlying_8be2vx$);
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.unaryMinus = function () {
    return new L3A0M0I0Theta0J0_per_T1N1(-this.underlying_8be2vx$);
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.plus_j0rjbv$ = function (that) {
    return new L3A0M0I0Theta0J0_per_T1N1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.minus_j0rjbv$ = function (that) {
    return new L3A0M0I0Theta0J0_per_T1N1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.times_3p81yu$ = function (that) {
    return new L3A0M0I0Theta0J0_per_T1N1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.div_3p81yu$ = function (that) {
    return new L3A0M0I0Theta0J0_per_T1N1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.rem_j0rjbv$ = function (that) {
    return new L3A0M0I0Theta0J0_per_T1N1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L3A0M0I0Theta0J0_per_T1N1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L3A0M0I0Theta0J0_per_T1N1(Math_0.abs(x));
    }
  });
  Object.defineProperty(L3A0M0I0Theta0J0_per_T1N1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L3A0M0I0Theta0J0_per_T1N1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L3A0M0I0Theta0J0_per_T1N1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L3A0M0I0Theta0J0_per_T1N1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L3A0M0I0Theta0J0_per_T1N1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L3A0M0I0Theta0J0_per_T1N1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L3A0M0I0Theta0J0_per_T1N1',
    interfaces: [Quan]
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L3A0M0I0Theta0J0_per_T1N1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2A0M1T0I0Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2A0M1T0I0Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2A0M1T0I0Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5kg';
    }
  });
  L2A0M1T0I0Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L2A0M1T0I0Theta0N0J0(siValue);
  };
  L2A0M1T0I0Theta0N0J0.prototype.unaryPlus = function () {
    return new L2A0M1T0I0Theta0N0J0(+this.underlying_8be2vx$);
  };
  L2A0M1T0I0Theta0N0J0.prototype.unaryMinus = function () {
    return new L2A0M1T0I0Theta0N0J0(-this.underlying_8be2vx$);
  };
  L2A0M1T0I0Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L2A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2A0M1T0I0Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L2A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2A0M1T0I0Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L2A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2A0M1T0I0Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L2A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2A0M1T0I0Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L2A0M1T0I0Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2A0M1T0I0Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2A0M1T0I0Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2A0M1T0I0Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2A0M1T0I0Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2A0M1T0I0Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2A0M1T0I0Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2A0M1T0I0Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2A0M1T0I0Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2A0M1T0I0Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2A0M1T0I0Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2A0M1T0I0Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2A0M1T0I0Theta0N0J0',
    interfaces: [Quan]
  };
  L2A0M1T0I0Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2A0M1T0I0Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2A0M1T0I0Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A0M0I0Theta0N0J0_per_T2(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T2.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T2.prototype, 'abrev', {
    get: function () {
      return 's\u207B\xB2';
    }
  });
  L0A0M0I0Theta0N0J0_per_T2.prototype.new_14dthe$ = function (siValue) {
    return new L0A0M0I0Theta0N0J0_per_T2(siValue);
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.unaryPlus = function () {
    return new L0A0M0I0Theta0N0J0_per_T2(+this.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.unaryMinus = function () {
    return new L0A0M0I0Theta0N0J0_per_T2(-this.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.plus_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.minus_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.times_3p81yu$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.div_3p81yu$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.rem_j0rjbv$ = function (that) {
    return new L0A0M0I0Theta0N0J0_per_T2(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T2.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A0M0I0Theta0N0J0_per_T2(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T2.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T2.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T2.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A0M0I0Theta0N0J0_per_T2.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A0M0I0Theta0N0J0_per_T2.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A0M0I0Theta0N0J0_per_T2.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A0M0I0Theta0N0J0_per_T2',
    interfaces: [Quan]
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A0M0I0Theta0N0J0_per_T2.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0T3I0Theta0N0J1_per_L2M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T3I0Theta0N0J1_per_L2M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T3I0Theta0N0J1_per_L2M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB2\u22C5kg\u207B\xB9\u22C5s\xB3\u22C5cd';
    }
  });
  A0T3I0Theta0N0J1_per_L2M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T3I0Theta0N0J1_per_L2M1(siValue);
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.unaryPlus = function () {
    return new A0T3I0Theta0N0J1_per_L2M1(+this.underlying_8be2vx$);
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.unaryMinus = function () {
    return new A0T3I0Theta0N0J1_per_L2M1(-this.underlying_8be2vx$);
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T3I0Theta0N0J1_per_L2M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T3I0Theta0N0J1_per_L2M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.times_3p81yu$ = function (that) {
    return new A0T3I0Theta0N0J1_per_L2M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.div_3p81yu$ = function (that) {
    return new A0T3I0Theta0N0J1_per_L2M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T3I0Theta0N0J1_per_L2M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T3I0Theta0N0J1_per_L2M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T3I0Theta0N0J1_per_L2M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T3I0Theta0N0J1_per_L2M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T3I0Theta0N0J1_per_L2M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T3I0Theta0N0J1_per_L2M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T3I0Theta0N0J1_per_L2M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T3I0Theta0N0J1_per_L2M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T3I0Theta0N0J1_per_L2M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T3I0Theta0N0J1_per_L2M1',
    interfaces: [Quan]
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T3I0Theta0N0J1_per_L2M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0A1M0T0I1Theta0N0J0(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0A1M0T0I1Theta0N0J0.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0A1M0T0I1Theta0N0J0.prototype, 'abrev', {
    get: function () {
      return 'rad\u22C5A';
    }
  });
  L0A1M0T0I1Theta0N0J0.prototype.new_14dthe$ = function (siValue) {
    return new L0A1M0T0I1Theta0N0J0(siValue);
  };
  L0A1M0T0I1Theta0N0J0.prototype.unaryPlus = function () {
    return new L0A1M0T0I1Theta0N0J0(+this.underlying_8be2vx$);
  };
  L0A1M0T0I1Theta0N0J0.prototype.unaryMinus = function () {
    return new L0A1M0T0I1Theta0N0J0(-this.underlying_8be2vx$);
  };
  L0A1M0T0I1Theta0N0J0.prototype.plus_j0rjbv$ = function (that) {
    return new L0A1M0T0I1Theta0N0J0(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0A1M0T0I1Theta0N0J0.prototype.minus_j0rjbv$ = function (that) {
    return new L0A1M0T0I1Theta0N0J0(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0A1M0T0I1Theta0N0J0.prototype.times_3p81yu$ = function (that) {
    return new L0A1M0T0I1Theta0N0J0(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0A1M0T0I1Theta0N0J0.prototype.div_3p81yu$ = function (that) {
    return new L0A1M0T0I1Theta0N0J0(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0A1M0T0I1Theta0N0J0.prototype.rem_j0rjbv$ = function (that) {
    return new L0A1M0T0I1Theta0N0J0(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0A1M0T0I1Theta0N0J0.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0A1M0T0I1Theta0N0J0.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0A1M0T0I1Theta0N0J0.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0A1M0T0I1Theta0N0J0(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0A1M0T0I1Theta0N0J0.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0A1M0T0I1Theta0N0J0.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0A1M0T0I1Theta0N0J0.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0A1M0T0I1Theta0N0J0.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0A1M0T0I1Theta0N0J0.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0A1M0T0I1Theta0N0J0.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0A1M0T0I1Theta0N0J0.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0A1M0T0I1Theta0N0J0',
    interfaces: [Quan]
  };
  L0A1M0T0I1Theta0N0J0.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0A1M0T0I1Theta0N0J0.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0A1M0T0I1Theta0N0J0.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function A0T2I2Theta0N0J0_per_L1M1(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(A0T2I2Theta0N0J0_per_L1M1.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L1M1.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5kg\u207B\xB9\u22C5s\xB2\u22C5A\xB2';
    }
  });
  A0T2I2Theta0N0J0_per_L1M1.prototype.new_14dthe$ = function (siValue) {
    return new A0T2I2Theta0N0J0_per_L1M1(siValue);
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.unaryPlus = function () {
    return new A0T2I2Theta0N0J0_per_L1M1(+this.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.unaryMinus = function () {
    return new A0T2I2Theta0N0J0_per_L1M1(-this.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.plus_j0rjbv$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L1M1(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.minus_j0rjbv$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L1M1(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.times_3p81yu$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L1M1(this.underlying_8be2vx$ * numberToDouble(that));
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.div_3p81yu$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L1M1(this.underlying_8be2vx$ / numberToDouble(that));
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.rem_j0rjbv$ = function (that) {
    return new A0T2I2Theta0N0J0_per_L1M1(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(A0T2I2Theta0N0J0_per_L1M1.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new A0T2I2Theta0N0J0_per_L1M1(Math_0.abs(x));
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L1M1.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L1M1.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L1M1.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(A0T2I2Theta0N0J0_per_L1M1.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  A0T2I2Theta0N0J0_per_L1M1.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  A0T2I2Theta0N0J0_per_L1M1.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'A0T2I2Theta0N0J0_per_L1M1',
    interfaces: [Quan]
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  A0T2I2Theta0N0J0_per_L1M1.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L2M1I0Theta0N0J0_per_A2T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L2M1I0Theta0N0J0_per_A2T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A2T3.prototype, 'abrev', {
    get: function () {
      return 'm\xB2\u22C5rad\u207B\xB2\u22C5kg\u22C5s\u207B\xB3';
    }
  });
  L2M1I0Theta0N0J0_per_A2T3.prototype.new_14dthe$ = function (siValue) {
    return new L2M1I0Theta0N0J0_per_A2T3(siValue);
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.unaryPlus = function () {
    return new L2M1I0Theta0N0J0_per_A2T3(+this.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.unaryMinus = function () {
    return new L2M1I0Theta0N0J0_per_A2T3(-this.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.plus_j0rjbv$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.minus_j0rjbv$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.times_3p81yu$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.div_3p81yu$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.rem_j0rjbv$ = function (that) {
    return new L2M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L2M1I0Theta0N0J0_per_A2T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L2M1I0Theta0N0J0_per_A2T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A2T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A2T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A2T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L2M1I0Theta0N0J0_per_A2T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L2M1I0Theta0N0J0_per_A2T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L2M1I0Theta0N0J0_per_A2T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L2M1I0Theta0N0J0_per_A2T3',
    interfaces: [Quan]
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L2M1I0Theta0N0J0_per_A2T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L1M1I0Theta0N0J0_per_A2T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L1M1I0Theta0N0J0_per_A2T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L1M1I0Theta0N0J0_per_A2T3.prototype, 'abrev', {
    get: function () {
      return 'm\u22C5rad\u207B\xB2\u22C5kg\u22C5s\u207B\xB3';
    }
  });
  L1M1I0Theta0N0J0_per_A2T3.prototype.new_14dthe$ = function (siValue) {
    return new L1M1I0Theta0N0J0_per_A2T3(siValue);
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.unaryPlus = function () {
    return new L1M1I0Theta0N0J0_per_A2T3(+this.underlying_8be2vx$);
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.unaryMinus = function () {
    return new L1M1I0Theta0N0J0_per_A2T3(-this.underlying_8be2vx$);
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.plus_j0rjbv$ = function (that) {
    return new L1M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.minus_j0rjbv$ = function (that) {
    return new L1M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.times_3p81yu$ = function (that) {
    return new L1M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.div_3p81yu$ = function (that) {
    return new L1M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.rem_j0rjbv$ = function (that) {
    return new L1M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L1M1I0Theta0N0J0_per_A2T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L1M1I0Theta0N0J0_per_A2T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(L1M1I0Theta0N0J0_per_A2T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L1M1I0Theta0N0J0_per_A2T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L1M1I0Theta0N0J0_per_A2T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L1M1I0Theta0N0J0_per_A2T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L1M1I0Theta0N0J0_per_A2T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L1M1I0Theta0N0J0_per_A2T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L1M1I0Theta0N0J0_per_A2T3',
    interfaces: [Quan]
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L1M1I0Theta0N0J0_per_A2T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function L0M1I0Theta0N0J0_per_A2T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(L0M1I0Theta0N0J0_per_A2T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(L0M1I0Theta0N0J0_per_A2T3.prototype, 'abrev', {
    get: function () {
      return 'rad\u207B\xB2\u22C5kg\u22C5s\u207B\xB3';
    }
  });
  L0M1I0Theta0N0J0_per_A2T3.prototype.new_14dthe$ = function (siValue) {
    return new L0M1I0Theta0N0J0_per_A2T3(siValue);
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.unaryPlus = function () {
    return new L0M1I0Theta0N0J0_per_A2T3(+this.underlying_8be2vx$);
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.unaryMinus = function () {
    return new L0M1I0Theta0N0J0_per_A2T3(-this.underlying_8be2vx$);
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.plus_j0rjbv$ = function (that) {
    return new L0M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.minus_j0rjbv$ = function (that) {
    return new L0M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.times_3p81yu$ = function (that) {
    return new L0M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.div_3p81yu$ = function (that) {
    return new L0M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.rem_j0rjbv$ = function (that) {
    return new L0M1I0Theta0N0J0_per_A2T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(L0M1I0Theta0N0J0_per_A2T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new L0M1I0Theta0N0J0_per_A2T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(L0M1I0Theta0N0J0_per_A2T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(L0M1I0Theta0N0J0_per_A2T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(L0M1I0Theta0N0J0_per_A2T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(L0M1I0Theta0N0J0_per_A2T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  L0M1I0Theta0N0J0_per_A2T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  L0M1I0Theta0N0J0_per_A2T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'L0M1I0Theta0N0J0_per_A2T3',
    interfaces: [Quan]
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  L0M1I0Theta0N0J0_per_A2T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function M1I0Theta0N0J0_per_L1A2T3(underlying) {
    this.underlying_8be2vx$ = underlying;
  }
  Object.defineProperty(M1I0Theta0N0J0_per_L1A2T3.prototype, 'siValue', {
    get: function () {
      return this.underlying_8be2vx$;
    }
  });
  Object.defineProperty(M1I0Theta0N0J0_per_L1A2T3.prototype, 'abrev', {
    get: function () {
      return 'm\u207B\xB9\u22C5rad\u207B\xB2\u22C5kg\u22C5s\u207B\xB3';
    }
  });
  M1I0Theta0N0J0_per_L1A2T3.prototype.new_14dthe$ = function (siValue) {
    return new M1I0Theta0N0J0_per_L1A2T3(siValue);
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.unaryPlus = function () {
    return new M1I0Theta0N0J0_per_L1A2T3(+this.underlying_8be2vx$);
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.unaryMinus = function () {
    return new M1I0Theta0N0J0_per_L1A2T3(-this.underlying_8be2vx$);
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.plus_j0rjbv$ = function (that) {
    return new M1I0Theta0N0J0_per_L1A2T3(this.underlying_8be2vx$ + that.underlying_8be2vx$);
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.minus_j0rjbv$ = function (that) {
    return new M1I0Theta0N0J0_per_L1A2T3(this.underlying_8be2vx$ - that.underlying_8be2vx$);
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.times_3p81yu$ = function (that) {
    return new M1I0Theta0N0J0_per_L1A2T3(this.underlying_8be2vx$ * numberToDouble(that));
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.div_3p81yu$ = function (that) {
    return new M1I0Theta0N0J0_per_L1A2T3(this.underlying_8be2vx$ / numberToDouble(that));
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.rem_j0rjbv$ = function (that) {
    return new M1I0Theta0N0J0_per_L1A2T3(this.underlying_8be2vx$ % that.underlying_8be2vx$);
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.min_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) < 0 ? this : that;
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.max_j0rjbv$ = function (that) {
    return this.compareTo_11rb$(that) > 0 ? this : that;
  };
  Object.defineProperty(M1I0Theta0N0J0_per_L1A2T3.prototype, 'abs', {
    get: function () {
      var x = this.underlying_8be2vx$;
      return new M1I0Theta0N0J0_per_L1A2T3(Math_0.abs(x));
    }
  });
  Object.defineProperty(M1I0Theta0N0J0_per_L1A2T3.prototype, 'signum', {
    get: function () {
      var $receiver = this.underlying_8be2vx$;
      return Math_0.sign($receiver);
    }
  });
  Object.defineProperty(M1I0Theta0N0J0_per_L1A2T3.prototype, 'isNegative', {
    get: function () {
      return this.underlying_8be2vx$ < 0;
    }
  });
  Object.defineProperty(M1I0Theta0N0J0_per_L1A2T3.prototype, 'isZero', {
    get: function () {
      return this.underlying_8be2vx$ === 0.0;
    }
  });
  Object.defineProperty(M1I0Theta0N0J0_per_L1A2T3.prototype, 'isPositive', {
    get: function () {
      return this.underlying_8be2vx$ > 0;
    }
  });
  M1I0Theta0N0J0_per_L1A2T3.prototype.compareTo_11rb$ = function (other) {
    return Kotlin.compareTo(this.underlying_8be2vx$, other.underlying_8be2vx$);
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.toString = function () {
    return this.underlying_8be2vx$.toString() + ' ' + this.abrev;
  };
  M1I0Theta0N0J0_per_L1A2T3.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'M1I0Theta0N0J0_per_L1A2T3',
    interfaces: [Quan]
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.unbox = function () {
    return this.underlying_8be2vx$;
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.underlying_8be2vx$) | 0;
    return result;
  };
  M1I0Theta0N0J0_per_L1A2T3.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && Kotlin.equals(this.underlying_8be2vx$, other.underlying_8be2vx$))));
  };
  function sin(x) {
    var x_0 = x.siValue;
    return new L0A0M0T0I0Theta0N0J0(Math_0.sin(x_0));
  }
  function cos(x) {
    var x_0 = x.siValue;
    return new L0A0M0T0I0Theta0N0J0(Math_0.cos(x_0));
  }
  function tan(x) {
    var x_0 = x.siValue;
    return new L0A0M0T0I0Theta0N0J0(Math_0.tan(x_0));
  }
  function asin(x) {
    var x_0 = x.siValue;
    return new L0A1M0T0I0Theta0N0J0(Math_0.asin(x_0));
  }
  function acos(x) {
    var x_0 = x.siValue;
    return new L0A1M0T0I0Theta0N0J0(Math_0.acos(x_0));
  }
  function atan(x) {
    var x_0 = x.siValue;
    return new L0A1M0T0I0Theta0N0J0(Math_0.atan(x_0));
  }
  function atan2(y, x) {
    var y_0 = y.siValue;
    var x_0 = x.siValue;
    return new L0A1M0T0I0Theta0N0J0(Math_0.atan2(y_0, x_0));
  }
  function hypot(x, y) {
    var x_0 = x.siValue;
    var y_0 = y.siValue;
    return new L1A0M0T0I0Theta0N0J0(Math_0.hypot(x_0, y_0));
  }
  function sqrt(x) {
    var x_0 = x.siValue;
    return new L0A0M0T0I0Theta0N0J0(Math_0.sqrt(x_0));
  }
  function exp(x) {
    var x_0 = x.siValue;
    return new L0A0M0T0I0Theta0N0J0(Math_0.exp(x_0));
  }
  function expm1(x, q) {
    var x_0 = q.invoke_j0rjbv$(x);
    return q.invoke_14dthe$(Math_0.expm1(x_0));
  }
  function log_0(x, base) {
    return new L0A0M0T0I0Theta0N0J0(log(x.siValue, base.siValue));
  }
  function ln(x, q) {
    var x_0 = q.invoke_j0rjbv$(x);
    return q.invoke_14dthe$(Math_0.log(x_0));
  }
  function log10(x, q) {
    var x_0 = q.invoke_j0rjbv$(x);
    return q.invoke_14dthe$(Math_0.log10(x_0));
  }
  function log2(x, q) {
    var x_0 = q.invoke_j0rjbv$(x);
    return q.invoke_14dthe$(Math_0.log2(x_0));
  }
  function ln1p(x, q) {
    var x_0 = q.invoke_j0rjbv$(x);
    return q.invoke_14dthe$(Math_0.log1p(x_0));
  }
  var ceil = defineInlineFunction('output.info.kunalsheth.units.math.ceil_v8fy06$', wrapFunction(function () {
    var Math_0 = Math;
    return function (x, q) {
      var x_0 = q.invoke_j0rjbv$(x);
      return q.invoke_14dthe$(Math_0.ceil(x_0));
    };
  }));
  var floor = defineInlineFunction('output.info.kunalsheth.units.math.floor_v8fy06$', wrapFunction(function () {
    var Math_0 = Math;
    return function (x, q) {
      var x_0 = q.invoke_j0rjbv$(x);
      return q.invoke_14dthe$(Math_0.floor(x_0));
    };
  }));
  var truncate = defineInlineFunction('output.info.kunalsheth.units.math.truncate_v8fy06$', wrapFunction(function () {
    var Math_0 = Math;
    return function (x, q) {
      var x_0 = q.invoke_j0rjbv$(x);
      return q.invoke_14dthe$(Math_0.trunc(x_0));
    };
  }));
  var round = defineInlineFunction('output.info.kunalsheth.units.math.round_v8fy06$', wrapFunction(function () {
    var round = Kotlin.kotlin.math.round_14dthe$;
    return function (x, q) {
      return q.invoke_14dthe$(round(q.invoke_j0rjbv$(x)));
    };
  }));
  var abs = defineInlineFunction('output.info.kunalsheth.units.math.abs_sgmb2a$', function (x) {
    return x.abs;
  });
  var sign = defineInlineFunction('output.info.kunalsheth.units.math.sign_sgmb2a$', function (x) {
    return x.signum;
  });
  var min = defineInlineFunction('output.info.kunalsheth.units.math.min_lj4v3w$', function (a, b) {
    return a.min_j0rjbv$(b);
  });
  var max = defineInlineFunction('output.info.kunalsheth.units.math.max_lj4v3w$', function (a, b) {
    return a.max_j0rjbv$(b);
  });
  function pow($receiver, x) {
    var $receiver_0 = $receiver.siValue;
    var x_0 = x.siValue;
    return new L0A0M0T0I0Theta0N0J0(Math_0.pow($receiver_0, x_0));
  }
  var withSign = defineInlineFunction('output.info.kunalsheth.units.math.withSign_jljluj$', wrapFunction(function () {
    var withSign = Kotlin.kotlin.math.withSign_38ydlf$;
    return function ($receiver, sign) {
      return $receiver.new_14dthe$(withSign($receiver.siValue, sign.siValue));
    };
  }));
  var get_ulp = defineInlineFunction('output.info.kunalsheth.units.math.get_ulp_z88jqz$', wrapFunction(function () {
    var get_ulp = Kotlin.kotlin.math.get_ulp_yrwdxr$;
    return function ($receiver) {
      return $receiver.new_14dthe$(get_ulp($receiver.siValue));
    };
  }));
  var nextUp = defineInlineFunction('output.info.kunalsheth.units.math.nextUp_z88jqz$', wrapFunction(function () {
    var nextUp = Kotlin.kotlin.math.nextUp_yrwdxr$;
    return function ($receiver) {
      return $receiver.new_14dthe$(nextUp($receiver.siValue));
    };
  }));
  var nextDown = defineInlineFunction('output.info.kunalsheth.units.math.nextDown_z88jqz$', wrapFunction(function () {
    var nextDown = Kotlin.kotlin.math.nextDown_yrwdxr$;
    return function ($receiver) {
      return $receiver.new_14dthe$(nextDown($receiver.siValue));
    };
  }));
  var nextTowards = defineInlineFunction('output.info.kunalsheth.units.math.nextTowards_yovr9j$', wrapFunction(function () {
    var nextTowards = Kotlin.kotlin.math.nextTowards_38ydlf$;
    return function ($receiver, to) {
      return $receiver.new_14dthe$(nextTowards($receiver.siValue, to.siValue));
    };
  }));
  var roundToInt = defineInlineFunction('output.info.kunalsheth.units.math.roundToInt_8hetjx$', wrapFunction(function () {
    var roundToInt = Kotlin.kotlin.math.roundToInt_yrwdxr$;
    return function ($receiver, q) {
      return q.invoke_14dthe$(roundToInt(q.invoke_j0rjbv$($receiver)));
    };
  }));
  var roundToLong = defineInlineFunction('output.info.kunalsheth.units.math.roundToLong_8hetjx$', wrapFunction(function () {
    var roundToLong = Kotlin.kotlin.math.roundToLong_yrwdxr$;
    return function ($receiver, q) {
      return q.invoke_14dthe$(roundToLong(q.invoke_j0rjbv$($receiver)).toNumber());
    };
  }));
  var plusOrMinus = defineInlineFunction('output.info.kunalsheth.units.math.plusOrMinus_yovr9j$', wrapFunction(function () {
    var Kind_CLASS = Kotlin.Kind.CLASS;
    var ClosedRange = Kotlin.kotlin.ranges.ClosedRange;
    rangeTo$ObjectLiteral.prototype.contains_mef7kx$ = ClosedRange.prototype.contains_mef7kx$;
    rangeTo$ObjectLiteral.prototype.isEmpty = ClosedRange.prototype.isEmpty;
    function rangeTo$ObjectLiteral(closure$that, this$rangeTo) {
      this.start_ehrlcp$_0 = this$rangeTo.min_j0rjbv$(closure$that);
      this.endInclusive_jp29m0$_0 = this$rangeTo.max_j0rjbv$(closure$that);
    }
    Object.defineProperty(rangeTo$ObjectLiteral.prototype, 'start', {
      get: function () {
        return this.start_ehrlcp$_0;
      }
    });
    Object.defineProperty(rangeTo$ObjectLiteral.prototype, 'endInclusive', {
      get: function () {
        return this.endInclusive_jp29m0$_0;
      }
    });
    rangeTo$ObjectLiteral.$metadata$ = {
      kind: Kind_CLASS,
      interfaces: [ClosedRange]
    };
    return function ($receiver, radius) {
      var $receiver_0 = $receiver.minus_j0rjbv$(radius);
      return new rangeTo$ObjectLiteral($receiver.plus_j0rjbv$(radius), $receiver_0);
    };
  }));
  var rangeTo = defineInlineFunction('output.info.kunalsheth.units.math.rangeTo_yovr9j$', wrapFunction(function () {
    var Kind_CLASS = Kotlin.Kind.CLASS;
    var ClosedRange = Kotlin.kotlin.ranges.ClosedRange;
    rangeTo$ObjectLiteral.prototype.contains_mef7kx$ = ClosedRange.prototype.contains_mef7kx$;
    rangeTo$ObjectLiteral.prototype.isEmpty = ClosedRange.prototype.isEmpty;
    function rangeTo$ObjectLiteral(closure$that, this$rangeTo) {
      this.start_ehrlcp$_0 = this$rangeTo.min_j0rjbv$(closure$that);
      this.endInclusive_jp29m0$_0 = this$rangeTo.max_j0rjbv$(closure$that);
    }
    Object.defineProperty(rangeTo$ObjectLiteral.prototype, 'start', {
      get: function () {
        return this.start_ehrlcp$_0;
      }
    });
    Object.defineProperty(rangeTo$ObjectLiteral.prototype, 'endInclusive', {
      get: function () {
        return this.endInclusive_jp29m0$_0;
      }
    });
    rangeTo$ObjectLiteral.$metadata$ = {
      kind: Kind_CLASS,
      interfaces: [ClosedRange]
    };
    return function ($receiver, that) {
      return new rangeTo$ObjectLiteral(that, $receiver);
    };
  }));
  var avg = defineInlineFunction('output.info.kunalsheth.units.math.avg_lj4v3w$', function (a, b) {
    return a.plus_j0rjbv$(b).div_3p81yu$(2);
  });
  var avg_0 = defineInlineFunction('output.info.kunalsheth.units.math.avg_2h62ra$', function (a, b, c) {
    return a.plus_j0rjbv$(b).plus_j0rjbv$(c).div_3p81yu$(3);
  });
  var avg_1 = defineInlineFunction('output.info.kunalsheth.units.math.avg_9uvjub$', wrapFunction(function () {
    var getPropertyCallableRef = Kotlin.getPropertyCallableRef;
    return function (first, x) {
      var tmp$ = first.siValue;
      var selector = getPropertyCallableRef('siValue', 1, function ($receiver) {
        return $receiver.siValue;
      });
      var tmp$_0;
      var sum = 0.0;
      for (tmp$_0 = 0; tmp$_0 !== x.length; ++tmp$_0) {
        var element = x[tmp$_0];
        sum += selector(element);
      }
      return first.new_14dthe$((tmp$ + sum) / (1 + x.length | 0));
    };
  }));
  var times_176 = defineInlineFunction('output.info.kunalsheth.units.math.times_uotjip$', function ($receiver, that) {
    return that.times_3p81yu$($receiver);
  });
  var exa = defineInlineFunction('output.info.kunalsheth.units.math.exa_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E18);
    };
  }));
  var exa_0 = defineInlineFunction('output.info.kunalsheth.units.math.exa_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E-18;
  });
  var peta = defineInlineFunction('output.info.kunalsheth.units.math.peta_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E15);
    };
  }));
  var peta_0 = defineInlineFunction('output.info.kunalsheth.units.math.peta_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E-15;
  });
  var tera = defineInlineFunction('output.info.kunalsheth.units.math.tera_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E12);
    };
  }));
  var tera_0 = defineInlineFunction('output.info.kunalsheth.units.math.tera_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E-12;
  });
  var giga = defineInlineFunction('output.info.kunalsheth.units.math.giga_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E9);
    };
  }));
  var giga_0 = defineInlineFunction('output.info.kunalsheth.units.math.giga_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E-9;
  });
  var mega = defineInlineFunction('output.info.kunalsheth.units.math.mega_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1000000.0);
    };
  }));
  var mega_0 = defineInlineFunction('output.info.kunalsheth.units.math.mega_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E-6;
  });
  var kilo = defineInlineFunction('output.info.kunalsheth.units.math.kilo_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1000.0);
    };
  }));
  var kilo_0 = defineInlineFunction('output.info.kunalsheth.units.math.kilo_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 0.001;
  });
  var hecto = defineInlineFunction('output.info.kunalsheth.units.math.hecto_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 100.0);
    };
  }));
  var hecto_0 = defineInlineFunction('output.info.kunalsheth.units.math.hecto_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 0.01;
  });
  var deca = defineInlineFunction('output.info.kunalsheth.units.math.deca_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 10.0);
    };
  }));
  var deca_0 = defineInlineFunction('output.info.kunalsheth.units.math.deca_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 0.1;
  });
  var deci = defineInlineFunction('output.info.kunalsheth.units.math.deci_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 0.1);
    };
  }));
  var deci_0 = defineInlineFunction('output.info.kunalsheth.units.math.deci_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 10.0;
  });
  var centi = defineInlineFunction('output.info.kunalsheth.units.math.centi_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 0.01);
    };
  }));
  var centi_0 = defineInlineFunction('output.info.kunalsheth.units.math.centi_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 100.0;
  });
  var milli = defineInlineFunction('output.info.kunalsheth.units.math.milli_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 0.001);
    };
  }));
  var milli_0 = defineInlineFunction('output.info.kunalsheth.units.math.milli_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1000.0;
  });
  var micro = defineInlineFunction('output.info.kunalsheth.units.math.micro_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E-6);
    };
  }));
  var micro_0 = defineInlineFunction('output.info.kunalsheth.units.math.micro_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1000000.0;
  });
  var nano = defineInlineFunction('output.info.kunalsheth.units.math.nano_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E-9);
    };
  }));
  var nano_0 = defineInlineFunction('output.info.kunalsheth.units.math.nano_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E9;
  });
  var pico = defineInlineFunction('output.info.kunalsheth.units.math.pico_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E-12);
    };
  }));
  var pico_0 = defineInlineFunction('output.info.kunalsheth.units.math.pico_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E12;
  });
  var femto = defineInlineFunction('output.info.kunalsheth.units.math.femto_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E-15);
    };
  }));
  var femto_0 = defineInlineFunction('output.info.kunalsheth.units.math.femto_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E15;
  });
  var atto = defineInlineFunction('output.info.kunalsheth.units.math.atto_z3xifh$', wrapFunction(function () {
    var numberToDouble = Kotlin.numberToDouble;
    return function ($receiver, f) {
      return f.invoke_14dthe$(numberToDouble($receiver) * 1.0E-18);
    };
  }));
  var atto_0 = defineInlineFunction('output.info.kunalsheth.units.math.atto_8hetjx$', function ($receiver, f) {
    return f.invoke_j0rjbv$($receiver) * 1.0E18;
  });
  var package$info = _.info || (_.info = {});
  var package$kunalsheth = package$info.kunalsheth || (package$info.kunalsheth = {});
  var package$units = package$kunalsheth.units || (package$kunalsheth.units = {});
  var package$generated = package$units.generated || (package$units.generated = {});
  package$generated.Quan = Quan;
  package$generated.OperationProof = OperationProof;
  Object.defineProperty(package$generated, 'times', {
    get: times_getInstance
  });
  Object.defineProperty(package$generated, 'div', {
    get: div_getInstance
  });
  package$generated.UomConverter = UomConverter;
  package$generated.box_sgmb2a$ = box;
  package$generated.L1A0M0T0I0Theta0N0J0 = L1A0M0T0I0Theta0N0J0;
  package$generated.get_Metre_rcaex3$ = get_Metre;
  package$generated.get_Metre_m013fg$ = get_Metre_0;
  $$importsForInline$$.output = _;
  Object.defineProperty(package$generated, 'Metre', {
    get: Metre_getInstance
  });
  package$generated.get_Mile_rcaex3$ = get_Mile;
  package$generated.get_Mile_m013fg$ = get_Mile_0;
  Object.defineProperty(package$generated, 'Mile', {
    get: Mile_getInstance
  });
  package$generated.get_Foot_rcaex3$ = get_Foot;
  package$generated.get_Foot_m013fg$ = get_Foot_0;
  Object.defineProperty(package$generated, 'Foot', {
    get: Foot_getInstance
  });
  package$generated.div_eif4rn$ = div_0;
  package$generated.div_b3048h$ = div_1;
  package$generated.p_b1l92a$ = p;
  package$generated.times_eif4rn$ = times_0;
  package$generated.times_b3048h$ = times_1;
  package$generated.p_8cxhxl$ = p_0;
  package$generated.div_cwts0z$ = div_2;
  package$generated.div_1ywss1$ = div_3;
  package$generated.p_cn6lsy$ = p_1;
  package$generated.times_cwts0z$ = times_2;
  package$generated.times_1ywss1$ = times_3;
  package$generated.p_6rc56x$ = p_2;
  package$generated.div_l9tnk4$ = div_4;
  package$generated.div_2vrufi$ = div_5;
  package$generated.p_4a6q9t$ = p_3;
  package$generated.times_l9tnk4$ = times_4;
  package$generated.times_2vrufi$ = times_5;
  package$generated.p_f4c0q2$ = p_4;
  package$generated.div_ori8e9$ = div_6;
  package$generated.div_sblkc5$ = div_7;
  package$generated.p_owtfdo$ = p_5;
  package$generated.times_spcidt$ = times_6;
  package$generated.times_nv76lh$ = times_7;
  package$generated.p_h2uc1j$ = p_6;
  package$generated.L0A0M0T0I0Theta0N0J0 = L0A0M0T0I0Theta0N0J0;
  package$generated.get_Turn_rcaex3$ = get_Turn;
  package$generated.get_Turn_f8mkmz$ = get_Turn_0;
  Object.defineProperty(package$generated, 'Turn', {
    get: Turn_getInstance
  });
  package$generated.get_Degree_rcaex3$ = get_Degree;
  package$generated.get_Degree_f8mkmz$ = get_Degree_0;
  Object.defineProperty(package$generated, 'Degree', {
    get: Degree_getInstance
  });
  package$generated.get_Percent_rcaex3$ = get_Percent;
  package$generated.get_Percent_f8mkmz$ = get_Percent_0;
  Object.defineProperty(package$generated, 'Percent', {
    get: Percent_getInstance
  });
  package$generated.div_3dqqxx$ = div_8;
  package$generated.div_x9ob2p$ = div_9;
  package$generated.p_k923b6$ = p_7;
  package$generated.times_3dnruk$ = times_8;
  package$generated.times_nsns8g$ = times_9;
  package$generated.p_562b9k$ = p_8;
  package$generated.times_3dqqxx$ = times_10;
  package$generated.times_x9ob2p$ = times_11;
  package$generated.p_bxgu21$ = p_9;
  package$generated.times_4z94l8$ = times_12;
  package$generated.times_wwr3ow$ = times_13;
  package$generated.p_3kgyiw$ = p_10;
  package$generated.times_a52an1$ = times_14;
  package$generated.times_9tvtkh$ = times_15;
  package$generated.p_1lc7ix$ = p_11;
  package$generated.div_576282$ = div_10;
  package$generated.div_sjnmba$ = div_11;
  package$generated.p_ugdjwl$ = p_12;
  package$generated.times_576282$ = times_16;
  package$generated.times_sjnmba$ = times_17;
  package$generated.p_8318xy$ = p_13;
  package$generated.times_bqnndp$ = times_18;
  package$generated.times_ixz50x$ = times_19;
  package$generated.p_36xk9l$ = p_14;
  package$generated.div_950c7m$ = div_12;
  package$generated.div_o398km$ = div_13;
  package$generated.p_qij9x1$ = p_15;
  package$generated.times_950c7m$ = times_20;
  package$generated.times_o398km$ = times_21;
  package$generated.p_c0vixi$ = p_16;
  package$generated.times_dc904d$ = times_22;
  package$generated.times_s22ghd$ = times_23;
  package$generated.p_4six09$ = p_17;
  package$generated.times_576277$ = times_24;
  package$generated.times_sjnmb9$ = times_25;
  package$generated.p_8318x3$ = p_18;
  package$generated.times_vh86se$ = times_26;
  package$generated.times_tnjt1y$ = times_27;
  package$generated.p_sld02i$ = p_19;
  package$generated.div_4z94l8$ = div_14;
  package$generated.div_wwr3ow$ = div_15;
  package$generated.p_sm1yub$ = p_20;
  package$generated.times_vh86t9$ = times_28;
  package$generated.times_tnjt1x$ = times_29;
  package$generated.p_sld03d$ = p_21;
  package$generated.div_t5jqrh$ = div_16;
  package$generated.div_rfrfkl$ = div_17;
  package$generated.p_680p30$ = p_22;
  package$generated.times_t5jqrh$ = times_30;
  package$generated.times_rfrfkl$ = times_31;
  package$generated.p_q9ok1l$ = p_23;
  package$generated.times_vh86u4$ = times_32;
  package$generated.times_tnjt1w$ = times_33;
  package$generated.p_sld048$ = p_24;
  package$generated.times_yz267y$ = times_34;
  package$generated.times_ym5q4q$ = times_35;
  package$generated.p_w36zi2$ = p_25;
  package$generated.times_u8jg9u$ = times_36;
  package$generated.times_pmytuy$ = times_37;
  package$generated.p_x4emzq$ = p_26;
  package$generated.div_yz268t$ = div_18;
  package$generated.div_ym5q4r$ = div_19;
  package$generated.p_ei9lo$ = p_27;
  package$generated.times_yz268t$ = times_38;
  package$generated.times_ym5q4r$ = times_39;
  package$generated.p_w36zix$ = p_28;
  package$generated.times_yz2673$ = times_40;
  package$generated.times_ym5q4p$ = times_41;
  package$generated.p_w36zh7$ = p_29;
  package$generated.div_zcolxl$ = div_20;
  package$generated.div_4u9e73$ = div_21;
  package$generated.p_vtww$ = p_30;
  package$generated.times_zcolxl$ = times_42;
  package$generated.times_4u9e73$ = times_43;
  package$generated.p_wgtf7p$ = p_31;
  package$generated.L2A0M0T0I0Theta0N0J0 = L2A0M0T0I0Theta0N0J0;
  package$generated.div_wei1du$ = div_22;
  package$generated.div_p2g19q$ = div_23;
  package$generated.p_4xa3z3$ = p_32;
  package$generated.div_pn3ild$ = div_24;
  package$generated.div_b3o2lr$ = div_25;
  package$generated.p_1u4ete$ = p_33;
  package$generated.div_vv7hst$ = div_26;
  package$generated.div_vzw21f$ = div_27;
  package$generated.p_boomrk$ = p_34;
  package$generated.times_vv7hst$ = times_44;
  package$generated.times_vzw21f$ = times_45;
  package$generated.p_ib77e3$ = p_35;
  package$generated.div_qp9neo$ = div_28;
  package$generated.div_s3jid0$ = div_29;
  package$generated.p_98wcot$ = p_36;
  package$generated.div_o1i5up$ = div_30;
  package$generated.div_k7re27$ = div_31;
  package$generated.p_3fprk2$ = p_37;
  package$generated.times_mrfdf4$ = times_46;
  package$generated.times_nn54mc$ = times_47;
  package$generated.p_m4t55k$ = p_38;
  package$generated.L0A0M0T1I0Theta0N0J0 = L0A0M0T1I0Theta0N0J0;
  package$generated.get_Second_rcaex3$ = get_Second;
  package$generated.get_Second_nlmg64$ = get_Second_0;
  Object.defineProperty(package$generated, 'Second', {
    get: Second_getInstance
  });
  package$generated.get_Hour_rcaex3$ = get_Hour;
  package$generated.get_Hour_nlmg64$ = get_Hour_0;
  Object.defineProperty(package$generated, 'Hour', {
    get: Hour_getInstance
  });
  package$generated.get_Minute_rcaex3$ = get_Minute;
  package$generated.get_Minute_nlmg64$ = get_Minute_0;
  Object.defineProperty(package$generated, 'Minute', {
    get: Minute_getInstance
  });
  package$generated.div_83wx7n$ = div_32;
  package$generated.div_hrsjld$ = div_33;
  package$generated.p_saw7s2$ = p_39;
  package$generated.div_6ibkgz$ = div_34;
  package$generated.div_8np84x$ = div_35;
  package$generated.p_twhkiq$ = p_40;
  package$generated.times_83wx7n$ = times_48;
  package$generated.times_hrsjld$ = times_49;
  package$generated.p_qtifxz$ = p_41;
  package$generated.times_6ibkgz$ = times_50;
  package$generated.times_8np84x$ = times_51;
  package$generated.p_sf3son$ = p_42;
  package$generated.div_evbg04$ = div_36;
  package$generated.div_3t0kxe$ = div_37;
  package$generated.p_ljhozl$ = p_43;
  package$generated.times_evbg04$ = times_52;
  package$generated.times_3t0kxe$ = times_53;
  package$generated.p_k23x5i$ = p_44;
  package$generated.times_dscapt$ = times_54;
  package$generated.times_yhhle3$ = times_55;
  package$generated.p_a9telj$ = p_45;
  package$generated.div_hq6kpd$ = div_38;
  package$generated.div_w382ud$ = div_39;
  package$generated.p_fkn47o$ = p_46;
  package$generated.times_dscaoy$ = times_56;
  package$generated.times_yhhle4$ = times_57;
  package$generated.p_a9teko$ = p_47;
  package$generated.times_mw1ybi$ = times_58;
  package$generated.times_xdleng$ = times_59;
  package$generated.p_qekufs$ = p_48;
  package$generated.times_kkdi9q$ = times_60;
  package$generated.times_zfq9uc$ = times_61;
  package$generated.p_o2wee0$ = p_49;
  package$generated.times_mw1ycd$ = times_62;
  package$generated.times_xdlenh$ = times_63;
  package$generated.p_qekugn$ = p_50;
  package$generated.div_qdvxq7$ = div_40;
  package$generated.div_qm6vuz$ = div_41;
  package$generated.p_bcefbw$ = p_51;
  package$generated.times_qdvxq7$ = times_64;
  package$generated.times_qm6vuz$ = times_65;
  package$generated.p_twetuh$ = p_52;
  package$generated.times_qdvxr2$ = times_66;
  package$generated.times_qm6vv0$ = times_67;
  package$generated.p_twetvc$ = p_53;
  package$generated.div_qridfu$ = div_42;
  package$generated.div_35pg2o$ = div_43;
  package$generated.p_ayrzm9$ = p_54;
  package$generated.L1A0M0I0Theta0N0J0_per_T1 = L1A0M0I0Theta0N0J0_per_T1;
  package$generated.div_511v25$ = div_44;
  package$generated.div_ueg3f3$ = div_45;
  package$generated.p_y68ll4$ = p_55;
  package$generated.times_j9580x$ = times_68;
  package$generated.times_oangr$ = times_69;
  package$generated.p_llwj8l$ = p_56;
  package$generated.div_aw5chs$ = div_46;
  package$generated.div_5izaoa$ = div_47;
  package$generated.p_6k495x$ = p_57;
  package$generated.times_aw5chs$ = times_70;
  package$generated.times_5izaoa$ = times_71;
  package$generated.p_tywerq$ = p_58;
  package$generated.times_q0jqte$ = times_72;
  package$generated.times_dahb78$ = times_73;
  package$generated.p_eui0g4$ = p_59;
  package$generated.times_8yw51p$ = times_74;
  package$generated.times_yuuh5r$ = times_75;
  package$generated.p_9t9m25$ = p_60;
  package$generated.times_rm53k2$ = times_76;
  package$generated.times_46dzqs$ = times_77;
  package$generated.p_d8wnpg$ = p_61;
  package$generated.times_511v25$ = times_78;
  package$generated.times_ueg3f3$ = times_79;
  package$generated.p_dr3w1p$ = p_62;
  package$generated.div_511v1a$ = div_48;
  package$generated.div_ueg3f4$ = div_49;
  package$generated.p_y68llz$ = p_63;
  package$generated.times_511v1a$ = times_80;
  package$generated.times_ueg3f4$ = times_81;
  package$generated.p_dr3w2k$ = p_64;
  package$generated.div_j9580x$ = div_50;
  package$generated.div_oangr$ = div_51;
  package$generated.p_ex44p2$ = p_65;
  package$generated.times_tbnxxe$ = times_82;
  package$generated.times_vica5s$ = times_83;
  package$generated.p_mxacxw$ = p_66;
  package$generated.L1A0M0T1I0Theta0N0J0 = L1A0M0T1I0Theta0N0J0;
  package$generated.div_pzzttu$ = div_52;
  package$generated.div_idnlwu$ = div_53;
  package$generated.p_cc0uqp$ = p_67;
  package$generated.div_hmzyap$ = div_54;
  package$generated.div_diyypb$ = div_55;
  package$generated.p_kp0q9u$ = p_68;
  package$generated.div_oeeh36$ = div_56;
  package$generated.div_rhqxda$ = div_57;
  package$generated.p_dxm7hd$ = p_69;
  package$generated.div_wrecmb$ = div_58;
  package$generated.div_wcfkkt$ = div_59;
  package$generated.p_5kmby8$ = p_70;
  package$generated.times_wrecmb$ = times_84;
  package$generated.times_wcfkkt$ = times_85;
  package$generated.p_gv8qhh$ = p_71;
  package$generated.div_j8lb1d$ = div_60;
  package$generated.div_4evn8v$ = div_61;
  package$generated.p_j3fdj6$ = p_72;
  package$generated.div_xcogw0$ = div_62;
  package$generated.div_ypjnd8$ = div_63;
  package$generated.p_z6egw3$ = p_73;
  package$generated.times_xcogw0$ = times_86;
  package$generated.times_ypjnd8$ = times_87;
  package$generated.p_fbs7pk$ = p_74;
  package$generated.div_xqlb3k$ = div_64;
  package$generated.div_vv60v8$ = div_65;
  package$generated.p_v8k6wj$ = p_75;
  package$generated.times_xqlb3k$ = times_88;
  package$generated.times_vv60v8$ = times_89;
  package$generated.p_j9mhp4$ = p_76;
  package$generated.div_g1elk1$ = div_66;
  package$generated.div_mn2a5r$ = div_67;
  package$generated.p_mam30i$ = p_77;
  package$generated.A0M0T1I0Theta0N0J0_per_L1 = A0M0T1I0Theta0N0J0_per_L1;
  package$generated.div_5t1665$ = div_68;
  package$generated.div_ii7kpd$ = div_69;
  package$generated.p_79wg88$ = p_78;
  package$generated.times_gpua0h$ = times_90;
  package$generated.times_7urw57$ = times_91;
  package$generated.p_83rxx$ = p_79;
  package$generated.div_9yfr80$ = div_70;
  package$generated.div_ltjut6$ = div_71;
  package$generated.p_bixrxn$ = p_80;
  package$generated.times_9yfr80$ = times_92;
  package$generated.times_ltjut6$ = times_93;
  package$generated.p_6ziaqe$ = p_81;
  package$generated.times_nh8ssy$ = times_94;
  package$generated.times_6402is$ = times_95;
  package$generated.p_6jaquk$ = p_82;
  package$generated.times_1v6w6l$ = times_96;
  package$generated.times_mylyg1$ = times_97;
  package$generated.p_tj1ij7$ = p_83;
  package$generated.times_p2u5jm$ = times_98;
  package$generated.times_3038xo$ = times_99;
  package$generated.p_84w3l8$ = p_84;
  package$generated.L0A0M0T2I0Theta0N0J0 = L0A0M0T2I0Theta0N0J0;
  package$generated.div_9mwe01$ = div_72;
  package$generated.div_fy9usv$ = div_73;
  package$generated.p_vh708u$ = p_85;
  package$generated.div_hzw9j6$ = div_74;
  package$generated.div_ksyi0e$ = div_75;
  package$generated.p_v6x675$ = p_86;
  package$generated.div_qcw52b$ = div_76;
  package$generated.div_pnn57x$ = div_77;
  package$generated.p_mtxao0$ = p_87;
  package$generated.times_qcw52b$ = times_100;
  package$generated.times_pnn57x$ = times_101;
  package$generated.p_izfdm3$ = p_88;
  package$generated.times_mdij7k$ = times_102;
  package$generated.times_qhir4c$ = times_103;
  package$generated.p_cglk94$ = p_89;
  package$generated.div_b8hqqp$ = div_78;
  package$generated.div_6u6jcf$ = div_79;
  package$generated.p_x2sczi$ = p_90;
  package$generated.div_qbct74$ = div_80;
  package$generated.div_uxx4v0$ = div_81;
  package$generated.p_4mqyib$ = p_91;
  package$generated.times_hspp9b$ = times_104;
  package$generated.times_im81l9$ = times_105;
  package$generated.p_rpmo7r$ = p_92;
  package$generated.div_hspp7l$ = div_82;
  package$generated.div_im81l7$ = div_83;
  package$generated.p_maal24$ = p_93;
  package$generated.div_i6c4y3$ = div_84;
  package$generated.div_b5oacf$ = div_85;
  package$generated.p_lwo5bm$ = p_94;
  package$generated.L2A0M0I0Theta0N0J0_per_T2 = L2A0M0I0Theta0N0J0_per_T2;
  package$generated.get_Gray_rcaex3$ = get_Gray;
  package$generated.get_Gray_vunwxs$ = get_Gray_0;
  Object.defineProperty(package$generated, 'Gray', {
    get: Gray_getInstance
  });
  package$generated.get_Sievert_rcaex3$ = get_Sievert;
  package$generated.get_Sievert_vunwxs$ = get_Sievert_0;
  Object.defineProperty(package$generated, 'Sievert', {
    get: Sievert_getInstance
  });
  package$generated.div_youxr7$ = div_86;
  package$generated.div_n1ck41$ = div_87;
  package$generated.p_bv5od4$ = p_95;
  package$generated.div_c54sj$ = div_88;
  package$generated.div_o58qup$ = div_89;
  package$generated.p_ot8knc$ = p_96;
  package$generated.div_uoyy5c$ = div_90;
  package$generated.div_cztey2$ = div_91;
  package$generated.p_19ksqj$ = p_97;
  package$generated.times_uoyy5c$ = times_106;
  package$generated.times_cztey2$ = times_107;
  package$generated.p_keqch2$ = p_98;
  package$generated.div_vz58an$ = div_92;
  package$generated.div_854rqj$ = div_93;
  package$generated.p_73f2sm$ = p_99;
  package$generated.div_c54te$ = div_94;
  package$generated.div_o58quo$ = div_95;
  package$generated.p_ot8ko7$ = p_100;
  package$generated.times_1zjb8e$ = times_108;
  package$generated.times_lxgddc$ = times_109;
  package$generated.p_dy7sv8$ = p_101;
  package$generated.L1A0M0I0Theta0N0J0_per_T2 = L1A0M0I0Theta0N0J0_per_T2;
  package$generated.div_87ke4k$ = div_96;
  package$generated.div_z1cys0$ = div_97;
  package$generated.p_ept3x5$ = p_102;
  package$generated.div_87ke5f$ = div_98;
  package$generated.div_z1cys1$ = div_99;
  package$generated.p_ept3wa$ = p_103;
  package$generated.times_87ke4k$ = times_110;
  package$generated.times_z1cys0$ = times_111;
  package$generated.p_ib1qg4$ = p_104;
  package$generated.times_87ke5f$ = times_112;
  package$generated.times_z1cys1$ = times_113;
  package$generated.p_ib1qf9$ = p_105;
  package$generated.div_b4mrz5$ = div_100;
  package$generated.div_crrcyx$ = div_101;
  package$generated.p_eec9yc$ = p_106;
  package$generated.times_b4mrz5$ = times_114;
  package$generated.times_crrcyx$ = times_115;
  package$generated.p_pgp5l3$ = p_107;
  package$generated.times_jhmnia$ = times_116;
  package$generated.times_7x2pre$ = times_117;
  package$generated.p_h3pa1y$ = p_108;
  package$generated.div_sgtuv1$ = div_102;
  package$generated.div_yvuwgf$ = div_103;
  package$generated.p_jmwp2e$ = p_109;
  package$generated.L2A0M0I0Theta0N0J0_per_T3 = L2A0M0I0Theta0N0J0_per_T3;
  package$generated.div_n3mv18$ = div_104;
  package$generated.div_iefor4$ = div_105;
  package$generated.p_a9wo3r$ = p_110;
  package$generated.div_dkre03$ = div_106;
  package$generated.div_jibvhr$ = div_107;
  package$generated.p_o2t4u2$ = p_111;
  package$generated.div_n3mv0d$ = div_108;
  package$generated.div_iefor3$ = div_109;
  package$generated.p_a9wo4m$ = p_112;
  package$generated.div_uxgdmp$ = div_110;
  package$generated.div_k8lh8p$ = div_111;
  package$generated.p_6kn81w$ = p_113;
  package$generated.times_uxgdmp$ = times_118;
  package$generated.times_k8lh8p$ = times_119;
  package$generated.p_fwj3af$ = p_114;
  package$generated.div_dkrdz8$ = div_112;
  package$generated.div_jibvhs$ = div_113;
  package$generated.p_o2t4ux$ = p_115;
  package$generated.div_vqnsta$ = div_114;
  package$generated.div_fdwu16$ = div_115;
  package$generated.p_exn3l1$ = p_116;
  package$generated.times_vqnsta$ = times_120;
  package$generated.times_fdwu16$ = times_121;
  package$generated.p_7jj7ra$ = p_117;
  package$generated.div_b92xyb$ = div_116;
  package$generated.div_haji0f$ = div_117;
  package$generated.p_qehkvu$ = p_118;
  package$generated.times_b92xyb$ = times_122;
  package$generated.times_haji0f$ = times_123;
  package$generated.p_p0qmm3$ = p_119;
  package$generated.div_dkre0y$ = div_118;
  package$generated.div_jibvhq$ = div_119;
  package$generated.p_o2t4t7$ = p_120;
  package$generated.L0A0M0I0Theta0N0J0_per_T1 = L0A0M0I0Theta0N0J0_per_T1;
  package$generated.get_Hertz_rcaex3$ = get_Hertz;
  package$generated.get_Hertz_tizgwv$ = get_Hertz_0;
  Object.defineProperty(package$generated, 'Hertz', {
    get: Hertz_getInstance
  });
  package$generated.get_Becquerel_rcaex3$ = get_Becquerel;
  package$generated.get_Becquerel_tizgwv$ = get_Becquerel_0;
  Object.defineProperty(package$generated, 'Becquerel', {
    get: Becquerel_getInstance
  });
  package$generated.div_2udear$ = div_120;
  package$generated.div_ijxr2p$ = div_121;
  package$generated.p_5ct2yi$ = p_121;
  package$generated.times_viceos$ = times_124;
  package$generated.times_hg1kc0$ = times_125;
  package$generated.p_ra4ais$ = p_122;
  package$generated.div_8o6tof$ = div_122;
  package$generated.div_5ax8p5$ = div_123;
  package$generated.p_m81bus$ = p_123;
  package$generated.times_8o6tof$ = times_126;
  package$generated.times_5ax8p5$ = times_127;
  package$generated.p_z0v7vr$ = p_124;
  package$generated.times_561ubo$ = times_128;
  package$generated.times_gc5dlc$ = times_129;
  package$generated.p_9e9yho$ = p_125;
  package$generated.times_b6y5a$ = times_130;
  package$generated.times_g8lhm$ = times_131;
  package$generated.p_qnvccm$ = p_126;
  package$generated.times_561ucj$ = times_132;
  package$generated.times_gc5dld$ = times_133;
  package$generated.p_9e9yij$ = p_127;
  package$generated.L2A0M0I0Theta0N0J0_per_T4 = L2A0M0I0Theta0N0J0_per_T4;
  package$generated.div_qtdn7n$ = div_124;
  package$generated.div_evf04t$ = div_125;
  package$generated.p_1xqscc$ = p_128;
  package$generated.div_9v0lto$ = div_126;
  package$generated.div_drite6$ = div_127;
  package$generated.p_wez0lh$ = p_129;
  package$generated.div_v5xt42$ = div_128;
  package$generated.div_rhdjjc$ = div_129;
  package$generated.p_eev8ub$ = p_130;
  package$generated.times_v5xt42$ = times_134;
  package$generated.times_rhdjjc$ = times_135;
  package$generated.p_bebu3s$ = p_131;
  package$generated.times_vi6dbx$ = times_136;
  package$generated.times_mmowbt$ = times_137;
  package$generated.p_31bykn$ = p_132;
  package$generated.div_qtdn6s$ = div_130;
  package$generated.div_evf04u$ = div_131;
  package$generated.p_1xqsd7$ = p_133;
  package$generated.div_ohp750$ = div_132;
  package$generated.div_cnmmni$ = div_133;
  package$generated.p_49f8ez$ = p_134;
  package$generated.L2A0M1I0Theta0N0J0_per_T3 = L2A0M1I0Theta0N0J0_per_T3;
  package$generated.get_Watt_rcaex3$ = get_Watt;
  package$generated.get_Watt_zchwdc$ = get_Watt_0;
  Object.defineProperty(package$generated, 'Watt', {
    get: Watt_getInstance
  });
  package$generated.div_l6zi4d$ = div_134;
  package$generated.div_jbyp0x$ = div_135;
  package$generated.p_w7a7ug$ = p_135;
  package$generated.times_l6zi4d$ = times_138;
  package$generated.times_jbyp0x$ = times_139;
  package$generated.p_g7i3jx$ = p_136;
  package$generated.div_i49g4f$ = div_136;
  package$generated.div_ezawl$ = div_137;
  package$generated.p_h4f98m$ = p_137;
  package$generated.times_i49g4f$ = times_140;
  package$generated.times_ezawl$ = times_141;
  package$generated.p_zf9wh1$ = p_138;
  package$generated.div_qh9bnk$ = div_138;
  package$generated.div_4fpcay$ = div_139;
  package$generated.p_8rfdph$ = p_139;
  package$generated.times_qh9bnk$ = times_142;
  package$generated.times_4fpcay$ = times_143;
  package$generated.p_r8u9yy$ = p_140;
  package$generated.div_l6zi3i$ = div_140;
  package$generated.div_jbyp0w$ = div_141;
  package$generated.p_w7a7tl$ = p_141;
  package$generated.times_ktd2eq$ = times_144;
  package$generated.times_lx910k$ = times_145;
  package$generated.p_gl4j9k$ = p_142;
  package$generated.L4A0M2I0Theta0N0J0_per_T6 = L4A0M2I0Theta0N0J0_per_T6;
  package$generated.div_x7vh5v$ = div_142;
  package$generated.div_rfcohb$ = div_143;
  package$generated.p_sawm94$ = p_143;
  package$generated.div_vzq5bx$ = div_144;
  package$generated.div_ig5s7j$ = div_145;
  package$generated.p_y4f1qg$ = p_144;
  package$generated.div_qz9nts$ = div_146;
  package$generated.div_at9i7e$ = div_147;
  package$generated.p_351gcl$ = p_145;
  package$generated.times_qz9nts$ = times_146;
  package$generated.times_at9i7e$ = times_147;
  package$generated.p_mzmz16$ = p_146;
  package$generated.div_x7vh6q$ = div_148;
  package$generated.div_rfcohc$ = div_149;
  package$generated.p_sawm9z$ = p_147;
  package$generated.div_x7vh50$ = div_150;
  package$generated.div_rfcoha$ = div_151;
  package$generated.p_sawm89$ = p_148;
  package$generated.times_xlhwvi$ = times_148;
  package$generated.times_2cjngc$ = times_149;
  package$generated.p_c5mxlk$ = p_149;
  package$generated.L2A0M1I0Theta0N0J0_per_T4 = L2A0M1I0Theta0N0J0_per_T4;
  package$generated.div_7yd8wt$ = div_152;
  package$generated.div_ep1tnz$ = div_153;
  package$generated.p_a27vcq$ = p_150;
  package$generated.times_hvs0n2$ = times_150;
  package$generated.times_6tsre2$ = times_151;
  package$generated.p_ux2nae$ = p_151;
  package$generated.div_q8rw67$ = div_154;
  package$generated.div_bohell$ = div_155;
  package$generated.p_glnehw$ = p_152;
  package$generated.times_q8rw67$ = times_152;
  package$generated.times_bohell$ = times_153;
  package$generated.p_vr1j5l$ = p_153;
  package$generated.times_7yd8yj$ = times_154;
  package$generated.times_ep1to1$ = times_155;
  package$generated.p_funiyr$ = p_154;
  package$generated.times_7kqt81$ = times_156;
  package$generated.times_qk5wdh$ = times_157;
  package$generated.p_fh1389$ = p_155;
  package$generated.times_9is53x$ = times_158;
  package$generated.times_1z446j$ = times_159;
  package$generated.p_mk2rr9$ = p_156;
  package$generated.L2A0M1I0Theta0N0J0_per_T2 = L2A0M1I0Theta0N0J0_per_T2;
  package$generated.get_Joule_rcaex3$ = get_Joule;
  package$generated.get_Joule_zchwch$ = get_Joule_0;
  Object.defineProperty(package$generated, 'Joule', {
    get: Joule_getInstance
  });
  package$generated.div_yflrb2$ = div_156;
  package$generated.div_nyvkdu$ = div_157;
  package$generated.p_gorhnt$ = p_157;
  package$generated.div_yflrbx$ = div_158;
  package$generated.div_nyvkdv$ = div_159;
  package$generated.p_gorhmy$ = p_158;
  package$generated.div_icqvls$ = div_160;
  package$generated.div_7nrd78$ = div_161;
  package$generated.p_9a78g7$ = p_159;
  package$generated.div_qpqr4x$ = div_162;
  package$generated.div_2t2pzp$ = div_163;
  package$generated.p_x7cx2$ = p_160;
  package$generated.times_qpqr4x$ = times_160;
  package$generated.times_2t2pzp$ = times_161;
  package$generated.p_mqn0sb$ = p_161;
  package$generated.div_sm3btq$ = div_164;
  package$generated.div_wy2gnm$ = div_165;
  package$generated.p_mi9x55$ = p_162;
  package$generated.div_yflra7$ = div_166;
  package$generated.div_nyvkdt$ = div_167;
  package$generated.p_gorhoo$ = p_163;
  package$generated.times_yflra7$ = times_162;
  package$generated.times_nyvkdt$ = times_163;
  package$generated.p_mrgbwj$ = p_164;
  package$generated.div_y1zblf$ = div_168;
  package$generated.div_hac5nn$ = div_169;
  package$generated.p_h2dxdg$ = p_165;
  package$generated.times_y1zblf$ = times_164;
  package$generated.times_hac5nn$ = times_165;
  package$generated.p_mdtw7r$ = p_166;
  package$generated.div_9zr02n$ = div_170;
  package$generated.div_cig0er$ = div_171;
  package$generated.p_hn73zc$ = p_167;
  package$generated.A0T4I0Theta0N0J0_per_L2M1 = A0T4I0Theta0N0J0_per_L2M1;
  package$generated.div_702lnn$ = div_172;
  package$generated.div_5iq9x5$ = div_173;
  package$generated.p_9b9nky$ = p_168;
  package$generated.times_6mg5y0$ = times_166;
  package$generated.times_zamlus$ = times_167;
  package$generated.p_f8r4qg$ = p_169;
  package$generated.div_pw7iid$ = div_174;
  package$generated.div_c0aj8r$ = div_175;
  package$generated.p_uxtggg$ = p_170;
  package$generated.times_pw7iid$ = times_168;
  package$generated.times_c0aj8r$ = times_169;
  package$generated.p_ukt7dx$ = p_171;
  package$generated.times_cfylfc$ = times_170;
  package$generated.times_qbfpl0$ = times_171;
  package$generated.p_9f8p94$ = p_172;
  package$generated.times_6mg5yv$ = times_172;
  package$generated.times_zamlut$ = times_173;
  package$generated.p_f8r4pl$ = p_173;
  package$generated.times_6mg5x5$ = times_174;
  package$generated.times_zamlur$ = times_175;
  package$generated.p_f8r4rb$ = p_174;
  package$generated.L0A0M1T0I0Theta0N0J0 = L0A0M1T0I0Theta0N0J0;
  package$generated.get_Kilogram_rcaex3$ = get_Kilogram;
  package$generated.get_Kilogram_nol3bw$ = get_Kilogram_0;
  Object.defineProperty(package$generated, 'Kilogram', {
    get: Kilogram_getInstance
  });
  package$generated.get_Ounce_rcaex3$ = get_Ounce;
  package$generated.get_Ounce_nol3bw$ = get_Ounce_0;
  Object.defineProperty(package$generated, 'Ounce', {
    get: Ounce_getInstance
  });
  package$generated.get_Gram_rcaex3$ = get_Gram;
  package$generated.get_Gram_nol3bw$ = get_Gram_0;
  Object.defineProperty(package$generated, 'Gram', {
    get: Gram_getInstance
  });
  package$generated.get_Pound_rcaex3$ = get_Pound;
  package$generated.get_Pound_nol3bw$ = get_Pound_0;
  Object.defineProperty(package$generated, 'Pound', {
    get: Pound_getInstance
  });
  package$generated.L0A0M0T0I1Theta0N0J0 = L0A0M0T0I1Theta0N0J0;
  package$generated.get_Ampere_rcaex3$ = get_Ampere;
  package$generated.get_Ampere_d3rvrw$ = get_Ampere_0;
  Object.defineProperty(package$generated, 'Ampere', {
    get: Ampere_getInstance
  });
  package$generated.L0A0M0T0I0Theta1N0J0 = L0A0M0T0I0Theta1N0J0;
  package$generated.get_Kelvin_rcaex3$ = get_Kelvin;
  package$generated.get_Kelvin_erky8s$ = get_Kelvin_0;
  Object.defineProperty(package$generated, 'Kelvin', {
    get: Kelvin_getInstance
  });
  package$generated.L0A0M0T0I0Theta0N1J0 = L0A0M0T0I0Theta0N1J0;
  package$generated.get_Mole_rcaex3$ = get_Mole;
  package$generated.get_Mole_f8lxng$ = get_Mole_0;
  Object.defineProperty(package$generated, 'Mole', {
    get: Mole_getInstance
  });
  package$generated.L0A0M0T0I0Theta0N0J1 = L0A0M0T0I0Theta0N0J1;
  package$generated.get_Candela_rcaex3$ = get_Candela;
  package$generated.get_Candela_f8mkm4$ = get_Candela_0;
  Object.defineProperty(package$generated, 'Candela', {
    get: Candela_getInstance
  });
  package$generated.L0A1M0T0I0Theta0N0J0 = L0A1M0T0I0Theta0N0J0;
  package$generated.get_Radian_rcaex3$ = get_Radian;
  package$generated.get_Radian_vq9al8$ = get_Radian_0;
  Object.defineProperty(package$generated, 'Radian', {
    get: Radian_getInstance
  });
  package$generated.L0A2M0T0I0Theta0N0J0 = L0A2M0T0I0Theta0N0J0;
  package$generated.get_Steradian_rcaex3$ = get_Steradian;
  package$generated.get_Steradian_mt81fn$ = get_Steradian_0;
  Object.defineProperty(package$generated, 'Steradian', {
    get: Steradian_getInstance
  });
  package$generated.L1A0M1I0Theta0N0J0_per_T2 = L1A0M1I0Theta0N0J0_per_T2;
  package$generated.get_Newton_rcaex3$ = get_Newton;
  package$generated.get_Newton_1bwcn4$ = get_Newton_0;
  Object.defineProperty(package$generated, 'Newton', {
    get: Newton_getInstance
  });
  package$generated.A0M1I0Theta0N0J0_per_L1T2 = A0M1I0Theta0N0J0_per_L1T2;
  package$generated.get_Pascal_rcaex3$ = get_Pascal;
  package$generated.get_Pascal_i9xpre$ = get_Pascal_0;
  Object.defineProperty(package$generated, 'Pascal', {
    get: Pascal_getInstance
  });
  package$generated.L0A0M0T1I1Theta0N0J0 = L0A0M0T1I1Theta0N0J0;
  package$generated.get_Coulomb_rcaex3$ = get_Coulomb;
  package$generated.get_Coulomb_lgrrb1$ = get_Coulomb_0;
  Object.defineProperty(package$generated, 'Coulomb', {
    get: Coulomb_getInstance
  });
  package$generated.L2A0M1Theta0N0J0_per_T3I1 = L2A0M1Theta0N0J0_per_T3I1;
  package$generated.get_Volt_rcaex3$ = get_Volt;
  package$generated.get_Volt_6qm567$ = get_Volt_0;
  Object.defineProperty(package$generated, 'Volt', {
    get: Volt_getInstance
  });
  package$generated.A0T4I2Theta0N0J0_per_L2M1 = A0T4I2Theta0N0J0_per_L2M1;
  package$generated.get_Farad_rcaex3$ = get_Farad;
  package$generated.get_Farad_sbbr2r$ = get_Farad_0;
  Object.defineProperty(package$generated, 'Farad', {
    get: Farad_getInstance
  });
  package$generated.L2A0M1Theta0N0J0_per_T3I2 = L2A0M1Theta0N0J0_per_T3I2;
  package$generated.get_Ohm_rcaex3$ = get_Ohm;
  package$generated.get_Ohm_6qm55c$ = get_Ohm_0;
  Object.defineProperty(package$generated, 'Ohm', {
    get: Ohm_getInstance
  });
  package$generated.A0T3I2Theta0N0J0_per_L2M1 = A0T3I2Theta0N0J0_per_L2M1;
  package$generated.get_Siemens_rcaex3$ = get_Siemens;
  package$generated.get_Siemens_m4ooh8$ = get_Siemens_0;
  Object.defineProperty(package$generated, 'Siemens', {
    get: Siemens_getInstance
  });
  package$generated.L2A0M1Theta0N0J0_per_T2I1 = L2A0M1Theta0N0J0_per_T2I1;
  package$generated.get_Weber_rcaex3$ = get_Weber;
  package$generated.get_Weber_6qms5q$ = get_Weber_0;
  Object.defineProperty(package$generated, 'Weber', {
    get: Weber_getInstance
  });
  package$generated.L0A0M1Theta0N0J0_per_T2I1 = L0A0M1Theta0N0J0_per_T2I1;
  package$generated.get_Tesla_rcaex3$ = get_Tesla;
  package$generated.get_Tesla_92b85s$ = get_Tesla_0;
  Object.defineProperty(package$generated, 'Tesla', {
    get: Tesla_getInstance
  });
  package$generated.L2A0M1Theta0N0J0_per_T2I2 = L2A0M1Theta0N0J0_per_T2I2;
  package$generated.get_Henry_rcaex3$ = get_Henry;
  package$generated.get_Henry_6qms4v$ = get_Henry_0;
  Object.defineProperty(package$generated, 'Henry', {
    get: Henry_getInstance
  });
  package$generated.L0A2M0T0I0Theta0N0J1 = L0A2M0T0I0Theta0N0J1;
  package$generated.get_Lumen_rcaex3$ = get_Lumen;
  package$generated.get_Lumen_mt81gi$ = get_Lumen_0;
  Object.defineProperty(package$generated, 'Lumen', {
    get: Lumen_getInstance
  });
  package$generated.A0M0T0I0Theta0N0J1_per_L2 = A0M0T0I0Theta0N0J1_per_L2;
  package$generated.get_Lux_rcaex3$ = get_Lux;
  package$generated.get_Lux_svlfqn$ = get_Lux_0;
  Object.defineProperty(package$generated, 'Lux', {
    get: Lux_getInstance
  });
  package$generated.L0A0M0I0Theta0N1J0_per_T1 = L0A0M0I0Theta0N1J0_per_T1;
  package$generated.get_Katal_rcaex3$ = get_Katal;
  package$generated.get_Katal_6vfmo$ = get_Katal_0;
  Object.defineProperty(package$generated, 'Katal', {
    get: Katal_getInstance
  });
  package$generated.L3A0M0T0I0Theta0N0J0 = L3A0M0T0I0Theta0N0J0;
  package$generated.L3A0M0I0Theta0N0J0_per_T1 = L3A0M0I0Theta0N0J0_per_T1;
  package$generated.L1A0M0I0Theta0N0J0_per_T3 = L1A0M0I0Theta0N0J0_per_T3;
  package$generated.L1A0M0I0Theta0N0J0_per_T4 = L1A0M0I0Theta0N0J0_per_T4;
  package$generated.L0A1M0I0Theta0N0J0_per_T1 = L0A1M0I0Theta0N0J0_per_T1;
  package$generated.L0A1M0I0Theta0N0J0_per_T2 = L0A1M0I0Theta0N0J0_per_T2;
  package$generated.L1A0M1I0Theta0N0J0_per_T1 = L1A0M1I0Theta0N0J0_per_T1;
  package$generated.L2A0M1I0Theta0N0J0_per_T1 = L2A0M1I0Theta0N0J0_per_T1;
  package$generated.L2M1I0Theta0N0J0_per_A1T2 = L2M1I0Theta0N0J0_per_A1T2;
  package$generated.L1A0M1I0Theta0N0J0_per_T3 = L1A0M1I0Theta0N0J0_per_T3;
  package$generated.A0M0T0I0Theta0N0J0_per_L1 = A0M0T0I0Theta0N0J0_per_L1;
  package$generated.A0M1T0I0Theta0N0J0_per_L2 = A0M1T0I0Theta0N0J0_per_L2;
  package$generated.A0M1T0I0Theta0N0J0_per_L3 = A0M1T0I0Theta0N0J0_per_L3;
  package$generated.L3A0T0I0Theta0N0J0_per_M1 = L3A0T0I0Theta0N0J0_per_M1;
  package$generated.A0M0T0I0Theta0N1J0_per_L3 = A0M0T0I0Theta0N1J0_per_L3;
  package$generated.L3A0M0T0I0Theta0J0_per_N1 = L3A0M0T0I0Theta0J0_per_N1;
  package$generated.L2A0M1I0N0J0_per_T2Theta1 = L2A0M1I0N0J0_per_T2Theta1;
  package$generated.L2A0M1I0J0_per_T2Theta1N1 = L2A0M1I0J0_per_T2Theta1N1;
  package$generated.L2A0M0I0N0J0_per_T2Theta1 = L2A0M0I0N0J0_per_T2Theta1;
  package$generated.L2A0M1I0Theta0J0_per_T2N1 = L2A0M1I0Theta0J0_per_T2N1;
  package$generated.L0A0M1I0Theta0N0J0_per_T2 = L0A0M1I0Theta0N0J0_per_T2;
  package$generated.L0A0M1I0Theta0N0J0_per_T3 = L0A0M1I0Theta0N0J0_per_T3;
  package$generated.L1A0M1I0N0J0_per_T3Theta1 = L1A0M1I0N0J0_per_T3Theta1;
  package$generated.L2A0M0I0Theta0N0J0_per_T1 = L2A0M0I0Theta0N0J0_per_T1;
  package$generated.A0M1I0Theta0N0J0_per_L1T1 = A0M1I0Theta0N0J0_per_L1T1;
  package$generated.A0M0T1I1Theta0N0J0_per_L2 = A0M0T1I1Theta0N0J0_per_L2;
  package$generated.A0M0T1I1Theta0N0J0_per_L3 = A0M0T1I1Theta0N0J0_per_L3;
  package$generated.A0M0T0I1Theta0N0J0_per_L2 = A0M0T0I1Theta0N0J0_per_L2;
  package$generated.A0T3I2Theta0N0J0_per_L3M1 = A0T3I2Theta0N0J0_per_L3M1;
  package$generated.L0A0T3I2Theta0J0_per_M1N1 = L0A0T3I2Theta0J0_per_M1N1;
  package$generated.A0T4I2Theta0N0J0_per_L3M1 = A0T4I2Theta0N0J0_per_L3M1;
  package$generated.L1A0M1Theta0N0J0_per_T2I2 = L1A0M1Theta0N0J0_per_T2I2;
  package$generated.L1A0M1Theta0N0J0_per_T3I1 = L1A0M1Theta0N0J0_per_T3I1;
  package$generated.A0M0T0I1Theta0N0J0_per_L1 = A0M0T0I1Theta0N0J0_per_L1;
  package$generated.L0A0M0T1I0Theta0N0J1 = L0A0M0T1I0Theta0N0J1;
  package$generated.A0M0T1I0Theta0N0J1_per_L2 = A0M0T1I0Theta0N0J1_per_L2;
  package$generated.L0A0T1I1Theta0N0J0_per_M1 = L0A0T1I1Theta0N0J0_per_M1;
  package$generated.L3A0M1Theta0N0J0_per_T3I2 = L3A0M1Theta0N0J0_per_T3I2;
  package$generated.A0M1T0I0Theta0N0J0_per_L1 = A0M1T0I0Theta0N0J0_per_L1;
  package$generated.A0M0T1I1Theta0N0J0_per_L1 = A0M0T1I1Theta0N0J0_per_L1;
  package$generated.L0A0T0I0Theta0N1J0_per_M1 = L0A0T0I0Theta0N1J0_per_M1;
  package$generated.L0A0M1T0I0Theta0J0_per_N1 = L0A0M1T0I0Theta0J0_per_N1;
  package$generated.A0M0T0I0Theta0N0J0_per_L2 = A0M0T0I0Theta0N0J0_per_L2;
  package$generated.L0A0M1I0Theta0N0J0_per_T1 = L0A0M1I0Theta0N0J0_per_T1;
  package$generated.L2A0M0T0I1Theta0N0J0 = L2A0M0T0I1Theta0N0J0;
  package$generated.A0M1I0Theta0N0J0_per_L1T3 = A0M1I0Theta0N0J0_per_L1T3;
  package$generated.A0T3I0Theta1N0J0_per_L2M1 = A0T3I0Theta1N0J0_per_L2M1;
  package$generated.L0A0M0T0I0N0J0_per_Theta1 = L0A0M0T0I0N0J0_per_Theta1;
  package$generated.A0M0T0I0Theta1N0J0_per_L1 = A0M0T0I0Theta1N0J0_per_L1;
  package$generated.L0A0T2I1Theta0N0J0_per_M1 = L0A0T2I1Theta0N0J0_per_M1;
  package$generated.L1A0T2I0Theta0N0J0_per_M1 = L1A0T2I0Theta0N0J0_per_M1;
  package$generated.A0T2I2Theta0N0J0_per_L2M1 = A0T2I2Theta0N0J0_per_L2M1;
  package$generated.L1A0M1Theta0N0J0_per_T2I1 = L1A0M1Theta0N0J0_per_T2I1;
  package$generated.L3A0M1Theta0N0J0_per_T2I1 = L3A0M1Theta0N0J0_per_T2I1;
  package$generated.L3A0M0I0Theta0J0_per_T1N1 = L3A0M0I0Theta0J0_per_T1N1;
  package$generated.L2A0M1T0I0Theta0N0J0 = L2A0M1T0I0Theta0N0J0;
  package$generated.L0A0M0I0Theta0N0J0_per_T2 = L0A0M0I0Theta0N0J0_per_T2;
  package$generated.A0T3I0Theta0N0J1_per_L2M1 = A0T3I0Theta0N0J1_per_L2M1;
  package$generated.L0A1M0T0I1Theta0N0J0 = L0A1M0T0I1Theta0N0J0;
  package$generated.A0T2I2Theta0N0J0_per_L1M1 = A0T2I2Theta0N0J0_per_L1M1;
  package$generated.L2M1I0Theta0N0J0_per_A2T3 = L2M1I0Theta0N0J0_per_A2T3;
  package$generated.L1M1I0Theta0N0J0_per_A2T3 = L1M1I0Theta0N0J0_per_A2T3;
  package$generated.L0M1I0Theta0N0J0_per_A2T3 = L0M1I0Theta0N0J0_per_A2T3;
  package$generated.M1I0Theta0N0J0_per_L1A2T3 = M1I0Theta0N0J0_per_L1A2T3;
  var package$math = package$units.math || (package$units.math = {});
  package$math.sin_nxpzth$ = sin;
  package$math.cos_nxpzth$ = cos;
  package$math.tan_nxpzth$ = tan;
  package$math.asin_opnxpm$ = asin;
  package$math.acos_opnxpm$ = acos;
  package$math.atan_opnxpm$ = atan;
  package$math.atan2_df4eto$ = atan2;
  package$math.hypot_df4eto$ = hypot;
  package$math.sqrt_opnxpm$ = sqrt;
  package$math.exp_opnxpm$ = exp;
  package$math.expm1_wylh42$ = expm1;
  package$math.log_8rjs0k$ = log_0;
  package$math.ln_wylh42$ = ln;
  package$math.log10_wylh42$ = log10;
  package$math.log2_wylh42$ = log2;
  package$math.ln1p_wylh42$ = ln1p;
  package$math.ceil_v8fy06$ = ceil;
  package$math.floor_v8fy06$ = floor;
  package$math.truncate_v8fy06$ = truncate;
  package$math.round_v8fy06$ = round;
  package$math.abs_sgmb2a$ = abs;
  package$math.sign_sgmb2a$ = sign;
  package$math.min_lj4v3w$ = min;
  package$math.max_lj4v3w$ = max;
  package$math.pow_x9ob2p$ = pow;
  package$math.withSign_jljluj$ = withSign;
  package$math.get_ulp_z88jqz$ = get_ulp;
  package$math.nextUp_z88jqz$ = nextUp;
  package$math.nextDown_z88jqz$ = nextDown;
  package$math.nextTowards_yovr9j$ = nextTowards;
  package$math.roundToInt_8hetjx$ = roundToInt;
  package$math.roundToLong_8hetjx$ = roundToLong;
  package$math.rangeTo_yovr9j$ = rangeTo;
  package$math.plusOrMinus_yovr9j$ = plusOrMinus;
  package$math.avg_lj4v3w$ = avg;
  package$math.avg_2h62ra$ = avg_0;
  package$math.avg_9uvjub$ = avg_1;
  package$math.times_uotjip$ = times_176;
  package$math.exa_z3xifh$ = exa;
  package$math.exa_8hetjx$ = exa_0;
  package$math.peta_z3xifh$ = peta;
  package$math.peta_8hetjx$ = peta_0;
  package$math.tera_z3xifh$ = tera;
  package$math.tera_8hetjx$ = tera_0;
  package$math.giga_z3xifh$ = giga;
  package$math.giga_8hetjx$ = giga_0;
  package$math.mega_z3xifh$ = mega;
  package$math.mega_8hetjx$ = mega_0;
  package$math.kilo_z3xifh$ = kilo;
  package$math.kilo_8hetjx$ = kilo_0;
  package$math.hecto_z3xifh$ = hecto;
  package$math.hecto_8hetjx$ = hecto_0;
  package$math.deca_z3xifh$ = deca;
  package$math.deca_8hetjx$ = deca_0;
  package$math.deci_z3xifh$ = deci;
  package$math.deci_8hetjx$ = deci_0;
  package$math.centi_z3xifh$ = centi;
  package$math.centi_8hetjx$ = centi_0;
  package$math.milli_z3xifh$ = milli;
  package$math.milli_8hetjx$ = milli_0;
  package$math.micro_z3xifh$ = micro;
  package$math.micro_8hetjx$ = micro_0;
  package$math.nano_z3xifh$ = nano;
  package$math.nano_8hetjx$ = nano_0;
  package$math.pico_z3xifh$ = pico;
  package$math.pico_8hetjx$ = pico_0;
  package$math.femto_z3xifh$ = femto;
  package$math.femto_8hetjx$ = femto_0;
  package$math.atto_z3xifh$ = atto;
  package$math.atto_8hetjx$ = atto_0;
  Kotlin.defineModule('output', _);
  return _;
}(typeof output === 'undefined' ? {} : output, kotlin);

//# sourceMappingURL=output.js.map
