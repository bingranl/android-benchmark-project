package com.android.example.module22_module01_module22_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module257_module3.ClassAAD = com.android.example.module06_module257_module3.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module257_module3.ClassAAE = com.android.example.module06_module257_module3.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module257_module3.ClassAAD,
		param1: com.android.example.module06_module257_module3.ClassAAE,
		param2: com.android.example.module06_module257_module3.ClassAAG,
		param3: com.android.example.module06_module257_module3.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			param0.method1(io.reactivex.subscribers.TestSubscriber())

		}
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onNext(kotlin.Any())

	}

	fun method1(
		param0: com.android.example.module06_module257_module3.ClassAAJ,
		param1: com.android.example.module06_module257_module3.ClassAAJ,
		param2: com.android.example.module06_module257_module3.ClassAAG,
		param3: com.android.example.module06_module257_module3.ClassAAC
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.observers.TestObserver())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-438350526283017973)

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

	}

	fun method2(
		param0: com.android.example.module06_module257_module3.ClassAAB,
		param1: com.android.example.module06_module257_module3.ClassAAF
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

	}

	fun method3(
		param0: com.android.example.module06_module257_module3.ClassAAC,
		param1: com.android.example.module06_module257_module3.ClassAAC,
		param2: com.android.example.module06_module257_module3.ClassAAI,
		param3: com.android.example.module06_module257_module3.ClassAAF
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}
}
