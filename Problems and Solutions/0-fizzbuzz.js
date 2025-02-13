// JavaScript

class FizzBuzz {
  solve() {
    const fs = require("fs");
    const n = parseInt(
      fs.readFileSync(
        0, "utf-8"
      ).trim(), 10
    );

    for (let i = 1; i <= n; i++) {
      if (i % 3 === 0 && i % 5 === 0) {
        console.log("FizzBuzz");
      } else if (i % 3 === 0) {
        console.log("Fizz");
      } else if (i % 5 === 0) {
        console.log("Buzz");
      } else {
        console.log(i);
      }
    }
  }
}

new FizzBuzz().solve();
