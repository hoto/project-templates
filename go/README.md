[![Docker hub](https://images.microbadger.com/badges/image/hoto/myapp.svg)](https://microbadger.com/images/hoto/myapp "Get your own image badge on microbadger.com")
[![CircleCI](https://circleci.com/gh/hoto/myapp/tree/master.svg?style=svg)](https://circleci.com/gh/hoto/myapp/tree/master)
[![Go Report Card](https://goreportcard.com/badge/github.com/hoto/myapp)](https://goreportcard.com/report/github.com/hoto/myapp)
[![Maintainability](https://api.codeclimate.com/v1/badges/27f61a82b9a5589f1a07/maintainability)](https://codeclimate.com/github/hoto/myapp/maintainability)
[![Release](https://img.shields.io/github/release/hoto/myapp.svg?style=flat-square)](https://github.com/hoto/myapp/releases/latest)
# myapp
 
### Development

Get:

    go get github.com/hoto/myapp/cmd/myapp/

Download dependencies:

    make dependencies

Build and test:

    make clean
    make build
    make test

Install to global golang bin directory:

    make install

---
_Following_ [_Standard Go Project Layout_](https://github.com/golang-standards/project-layout)
