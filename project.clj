(defproject earthen/clj-cb "0.2.3-SNAPSHOT"
  :description "A Clojure java-client wrapper for Couchbase Server 4.x"
  :url "https://github.com/Earthen/clj-cb"
  :license {:name "Apache Public License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [com.couchbase.client/java-client "2.2.8"]]
  :plugins [[lein-codox "0.9.4"]])
