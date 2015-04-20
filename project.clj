(defproject gloss "0.2.6-SNAPSHOT"
  :description "speaks in bytes, so that you don't have to"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.7.0-beta1"]
                 [manifold "0.1.0"]
                 [byte-streams "0.2.0"]
                 [potemkin "0.3.13"]
                 [io.netty/netty-buffer "4.0.27.Final"]]
  :repositories {"sonatype" "https://oss.sonatype.org/content/groups/public/"}
  :jvm-opts ["-server"])
