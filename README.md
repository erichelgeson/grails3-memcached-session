# grails3-memcached-session

This implements the Memcached Session Manager <https://code.google.com/p/memcached-session-manager> to store sessions in memcached.

Note that memcached sessions are not written to disk, so a restart of memcached will clear all of your sessions!

# Persistence

* Use failover strategy described in the MSM [documentation](https://code.google.com/p/memcached-session-manager/wiki/SetupAndConfiguration).
* Use a persistent memcached server
 - [go-memcached](https://github.com/valyala/ybc/tree/master/apps/go/memcached)
 - [memcached-dd](http://www.pontikis.net/blog/tag/memcached-dd)
 - [couchbase](http://www.couchbase.com/)

# Credit

<https://stackoverflow.com/questions/25788969/memcached-with-spring-boot>
