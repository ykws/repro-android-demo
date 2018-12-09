# repro-android-demo
Integrate [Repro Android SDK](https://github.com/reproio/repro-android-sdk)

## Set up

Get Repro API Token on your dashboard and set environment variable.

```
$ launchctl setenv REPRO_DEMO_API_KEY {Repro_API_Token}
```

If Android Studio launched, you must restart it, because cannot load environment variable!

### Troubleshooting

Show environment variable.

```
$ launchctl getenv REPRO_DEMO_API_KEY
{Repro_API_Token}
```

## More information
[Development Guide](https://docs.repro.io/en/dev/sdk/getstarted/android.html)
