package com.android.example.module07_module21_module02_module1_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module5.ClassAAC = com.android.example.module07_module21_module02_module1_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module5.ClassAAB = com.android.example.module07_module21_module02_module1_module5.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module07_module21_module02_module1_module5.ClassAAC = com.android.example.module07_module21_module02_module1_module5.ClassAAC()
	private 	val instance_var_1_3: com.android.example.module07_module21_module02_module1_module5.ClassAAH = com.android.example.module07_module21_module02_module1_module5.ClassAAH()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module1.ClassAAC
	) {
		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.onError(kotlin.Throwable())

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
			local_var_3_0.createWorker()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onError(kotlin.Throwable())

		}
		val local_var_2_2: io.reactivex.disposables.CompositeDisposable = io.reactivex.disposables.CompositeDisposable()
		local_var_2_2.isDisposed()

	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module1.ClassAAB,
		param1: com.android.example.module07_module21_module02_module1_module1.ClassAAB,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAI
	) {
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.isDisposed()

	}

	fun method2(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAE
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module07_module21_module02_module1_module1.ClassAAC,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAI,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAH
	) {
		param0.method1(com.android.example.module07_module21_module02_module1_module5.ClassAAE())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

	}
}
