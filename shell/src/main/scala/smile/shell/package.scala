/*******************************************************************************
 * (C) Copyright 2015 Haifeng Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package smile

/**
 * Common smile shell command.
 *
 * @author Haifeng Li
 */
package object shell {

  def help = {
    println(
      """
        | General:
        |   help -- print this summary
        |   :help -- print Scala shell command summary
        |   :quit -- exit the shell
        |
        | I/O:
        |   read --
        |   write --
        |
        | Classification:
        |   randomForest --
        |   svm --
        |
        | Graphics:
        |   plot --
      """.stripMargin
    )
  }

  def benchmark(data: String = "") = data match {
    case "airline" => smile.benchmark.Airline.benchmark
    case "usps" => smile.benchmark.USPS.benchmark
    case _ => println("Available benchmarks: airline, usps")
  }
}