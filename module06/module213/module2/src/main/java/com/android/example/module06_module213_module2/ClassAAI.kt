package com.android.example.module06_module213_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module213_module5.ClassAAD = com.android.example.module06_module213_module5.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module213_module5.ClassAAD = com.android.example.module06_module213_module5.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module213_module5.ClassAAF
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			listOf("1", "2", "3").forEach {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.onNext(kotlin.Any())

				}
			}
		}
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method1(
		param0: com.android.example.module06_module213_module5.ClassAAB,
		param1: com.android.example.module06_module213_module5.ClassAAD,
		param2: com.android.example.module06_module213_module5.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(911613524074093744)

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isDisposed()

	}

	fun method2(
		param0: com.android.example.module06_module213_module5.ClassAAE,
		param1: com.android.example.module06_module213_module5.ClassAAI
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.isDisposed()

	}

	fun method3(
		param0: com.android.example.module06_module213_module5.ClassAAD
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

		param0.method0(io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber())

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}
}
