FROM golang:1.12.4 AS builder
WORKDIR /go/src/github.com/hoto/myapp
COPY . .
RUN make build

FROM scratch
WORKDIR /
COPY --from=builder /go/src/github.com/hoto/myapp/bin/myapp .
CMD ["/myapp"]
