simple-naemon-model - Simplified configuration of neamon/nagios monitoring
==========================================================================

Setting up and maintaining naemon/nagios configuration can be a quite complex task. The idea of this project
is to hide this complexity by creating a simple model from which the configuration can be generated.

Configuration will be done using yaml notation.

Example:

```
hosts:
  - name: elasticsearch
    address: 10.0.0.1
    services:
    - name: elasticsearch_cluster_health
      command: check_http
      args:
      - uri: /_cluster/health?pretty=true
      - expect: '"status" : "green"'
```

This would setup a host "elasticsearch", one servicecheck "elasticsearch_cluster_health" and a check command with correct parameters.
