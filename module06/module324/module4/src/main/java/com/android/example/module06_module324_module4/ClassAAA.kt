package com.android.example.module06_module324_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.isCancelled()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_3.appendZoneId()

		if (kotlin.Any().equals(kotlin.Any())) {
			param0.cancel()

		} else {
			val local_var_3_0: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
			local_var_3_0.appendLiteral("SomeString")

		}
		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendInstant()

		val local_var_2_5: org.threeten.bp.zone.TzdbZoneRulesProvider = org.threeten.bp.zone.TzdbZoneRulesProvider()
		local_var_2_5.toString()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		param0.onNext(kotlin.Any())

		param0.cancel()

		param0.dispose()

		param0.onError(kotlin.Throwable())

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method4(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendChronologyId()

		val local_var_2_5: org.threeten.bp.zone.TzdbZoneRulesProvider = org.threeten.bp.zone.TzdbZoneRulesProvider()
		local_var_2_5.toString()

		param0.request(-8309901632181785368)

		param0.assertSubscribed()

	}
}
