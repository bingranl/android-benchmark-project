package com.android.example.module06_module083_module10

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module083_module09.ClassAAB = com.android.example.module06_module083_module09.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module083_module09.ClassAAG = com.android.example.module06_module083_module09.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module083_module09.ClassAAD,
		param1: com.android.example.module06_module083_module09.ClassAAA
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

	}

	fun method1(
		param0: com.android.example.module06_module083_module09.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method2(
		param0: com.android.example.module06_module083_module09.ClassAAD
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}

	fun method3(
		param0: com.android.example.module06_module083_module09.ClassAAF,
		param1: com.android.example.module06_module083_module09.ClassAAG,
		param2: com.android.example.module06_module083_module09.ClassAAC
	) {
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

	}

	fun method4(
		param0: com.android.example.module06_module083_module09.ClassAAC,
		param1: com.android.example.module06_module083_module09.ClassAAJ,
		param2: com.android.example.module06_module083_module09.ClassAAG
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(7942365784361044642)

		param0.method2(io.reactivex.subscribers.TestSubscriber())

	}
}
