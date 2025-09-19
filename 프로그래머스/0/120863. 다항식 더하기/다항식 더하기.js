function solution(polynomial) {
  let [xSum, numSum] = polynomial
    .split(" + ")
    .reduce(([x, n], term) => 
        term.includes("x")
          ? [x + (term === "x" ? 1 : +term.replace("x", "")), n]
          : [x, n + +term],
      [0, 0]
    );
  
  return (xSum ? (xSum === 1 ? "x" : `${xSum}x`) : "") +
         (xSum && numSum ? " + " : "") +
         (numSum ? numSum : "");
}
